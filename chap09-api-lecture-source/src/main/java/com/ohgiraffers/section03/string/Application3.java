package com.ohgiraffers.section03.string;

public class Application3 {
    public static void main(String[] args) {

        /* 수업목표. String 클래스의 자주사용하는 메소드를 숙지하고 응용할 수 있다. */
        /* 설명. 1. charAt() */
        String str1 = "apple";

        for (int i = 0; i < str1.length(); i++) {
            System.out.println("charAt (" + i + ") : " + (str1.charAt(i)));
        }

        /* 설명. 2. 문자열의 차이를 양수, 0 , 음수로 반환(용도는 정렬). */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "mariaDB";
        System.out.println(str2.compareTo(str3)); // 0
        System.out.println(str3.compareTo(str4)); // 32
        System.out.println(str3.compareTo(str5)); // -3

        /* 설명. 3. concat() 문자열 합치는 메소드 */
        System.out.println("concat(): " + str2.concat(str5));

        /* 설명. 4. indexOf() 왼쪽에서 부터 가장 첫번째 해당하는 문자열의 위치값 반환
         *          없으면 -1을 출력 */
        String str6 = "java mariaDB";
        System.out.println("intexOf('a'): " + str6.indexOf('a')); // 1
        System.out.println("intexOf('z'): " + str6.indexOf('z')); // -1
        /* 설명. 2번 인덱스부터 우측으로 'a'를 찾아서 발견한 위치의 inex값 반환 */
        System.out.println("intexOf('a', 2): " + str6.indexOf('a', 2)); // 3

        /* 설명. 5. trim() 공백제거 */
        String trimStr = "    java     ";
        System.out.println("trimStr: #" + trimStr + "#");
        System.out.println("trimStr: #" + trimStr.trim() + "#");

        /* 설명. 6. toLowerCase() / toUpperCase() 전체 소문자로/ 전체 대문자로 변경해 출력 */
        String caseStr = "javamariaDB";
        System.out.println("toLowerCase(): " + caseStr.toLowerCase());
        System.out.println("toUpperCase(): " + caseStr.toUpperCase());

        /* 설명. 7. substring() */
        String javamaraDB = "javamariaDB";
        System.out.println("substring(3,6) : " + javamaraDB.substring(3,6)); // 3번째 부터 6번째 까지 문자열 자름
        System.out.println("substring(3) : " + javamaraDB.substring(3)); // 3번째부터 마지막까지 문자열 자름

        /* 설명. 8. replace() 특정 문자열을 원하는 문자열로 변환 */
        System.out.println("replace() : " + javamaraDB.replace("java","python"));
        System.out.println("javamariaDB: " + javamaraDB);

        /* 설명. 9. length() */
        System.out.println("length(): " + javamaraDB.length());
        System.out.println("빈 문자열의 길이: " + "".length()); // 0

        /* 설명. 10. isEmpty() 문자열이 없으면 false, 있으면 false */
        System.out.println("isEmpty(): " + "".isEmpty()); // true
        System.out.println("isEmpty(): " + "abc".isEmpty()); // false

        /* 설명. 11. startsWith() 매개변수 값으로 문자열이 시작하는지 확인 true or false 반환 */
        System.out.println("startsWith(): " + "abcdef".startsWith("ab")); // true
        System.out.println("startsWith(): " + "cabdef".startsWith("ab")); // false




    }
}
