package com.ohgiraffers.section01.Autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);

        BookService bookService = context.getBean(BookService.class);

        /* 설명. 도서 전체 조회 후 List<BookDTO>가 돌아올 것을 상정 */
        List<BookDTO> bookList = bookService.findAllBook();
        bookList.forEach(System.out::println);

        /* 설명. 도서 번호로 조회 */
        System.out.println("1번 책: " + bookService.findBookBySerquenceOf(1));
        System.out.println("2번 책: " + bookService.findBookBySerquenceOf(2));
    }
}
