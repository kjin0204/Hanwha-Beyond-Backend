package com.ohgiraffers.parameterized.section01.params;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.time.Month;
import java.util.stream.Stream;

public class ParameterizedTests {

    /* 설명. 1. @ValueSource를 이용한 parameter value 목록 지정 */
    @DisplayName("홀수 짝수 판별 테스트")
    @ParameterizedTest
    @ValueSource(ints = {1, 3, -1, 15, 123})
    void testIsOdd(int number) {

        //when
        boolean result = NumberValidator.isOdd(number);

        Assertions.assertTrue(result);
    }

    /* 설명. @NullSource와 @EmptySource */
    @DisplayName("null값 테스트")
    @ParameterizedTest
    @NullSource
    void testIsNull(String input) {
        boolean result = StringValidator.isNull(input);
        Assertions.assertTrue(result);
    }

    /* 설명. @NullSource와 @EmptySource */
    @DisplayName("Empty값 테스트")
    @ParameterizedTest
    @EmptySource
    void testIsEmpty(String input) {
        boolean result = StringValidator.isEmpty(input);
        Assertions.assertTrue(result);
    }

    /* 설명. 3. 열거형을 이용한 @EnumSource 활용하기 */
    @DisplayName("Month enum에 정의된 1~12월 사이의 범위인지 테스트")
    @ParameterizedTest
    @EnumSource(Month.class)
    void testMonthValuIsCollect(Month month) {
        boolean result = DateValidator.isCollect(month);

        Assertions.assertTrue(result);
    }

    @DisplayName("2월, 4월, 6월, 9월, 11월을 제외한 달이 31일인지 확인")
    @ParameterizedTest
    @EnumSource(
            value = Month.class,
            names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"},
            mode = EnumSource.Mode.EXCLUDE
    )
    void testHasThirtyOneDayLong(Month month) {
        int varifyValue = 31;

        int catual = DateValidator.getLstDayOf(month);

        Assertions.assertEquals(varifyValue, catual);
    }


    /* 설명. @CsvSource를 이용한 CSV 리터럴 */
    //구분자 기준으로 쪼개서 각각의 매개변수에 나눠서 들억감
    @DisplayName("영문자를 대문자로 변경하는지 확인")
    @ParameterizedTest
    @CsvSource({"test,TEST", "tEst, TEST", "JavaScript, JAVASCRIPT"})
    void testToUpperCase(String input, String verifyValue) {
        System.out.println("input = " + input);
        System.out.println("verifyValue = " + verifyValue);

        //when
        String actual = input.toUpperCase();

        //then
        Assertions.assertEquals(verifyValue, actual);
    }


    /* 설명. @CsvSource를 이용한 CSV 리터럴 */
    //어노테이션 문법으로 2개이상의 속성을 사용 할 때는 속성명을 명시 해 줘야 함
    @DisplayName("영문자를 대문자로 변경하는지 확인")
    @ParameterizedTest
    @CsvSource(
            value = {"test:TEST", "tEst: TEST", "JavaScript: JAVASCRIPT"},
            delimiter = ':'
    )
    void testToUpperCase2(String input, String verifyValue) {
        System.out.println("input = " + input);
        System.out.println("verifyValue = " + verifyValue);

        //when
        String actual = input.toUpperCase();

        //then
        Assertions.assertEquals(verifyValue, actual);
    }

    @DisplayName("CSV 파일을 읽은 테스트 데이터를 테스트에 활용되는지 확인")
    @ParameterizedTest
    @CsvFileSource(resources = "/parameter-test-data.csv", numLinesToSkip = 1)
    void testToUpperCaseWithCSVFileData(String input, String verifyValue) {
        String actual = input.toUpperCase();
        Assertions.assertEquals(verifyValue, actual);
    }

    /* 설명. 5. @MethodSource를 활용한 테스트 인수 활용하기 */
    /* 설명. 메소드가 반환한 스트림을 활용해 여러 테스트 케이스를 테스트 해 볼 수 있음 */
    private static Stream<Arguments> providerStringSource() {
        return Stream.of(
                Arguments.of("hello world", "HELLO WORLD"),
                Arguments.of("JavaScript", "JAVASCRIPT"),
                Arguments.of("tEst", "TEST")
        );
    }

    @DisplayName("메소드 소스를 활용한 대문자 변환 테스트")
    @ParameterizedTest
    @MethodSource("providerStringSource")
    void testToUpperCaseWithMethodSource(String input, String verifyValue) {
        String actual = input.toUpperCase();
        Assertions.assertEquals(verifyValue, actual);
    }

    /* 설명. ArgumentsProvider를 이용한 메소드 소스 활용 */
    // 외부 클래스로(ArgumentsProvider를 상속받은) 부터 테스트 데이터 주입
    @DisplayName("두 수를 더한 결과를 정상적으로 반환하는지 테스트")
    @ParameterizedTest(name = "[{index}]{0} + {1} = {2} (이)가 맞는지 확인")
    @ArgumentsSource(SumTwoNumbersArgumentsProvicer.class)
    void testSumTwoNumbers(int num1, int num2, int verifyValue) {
        int actual = Calculator.sumTwoNumbers(num1, num2);
        Assertions.assertEquals(verifyValue, actual);
    }


}
