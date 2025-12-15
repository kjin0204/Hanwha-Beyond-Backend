package com.ohgiraffers.section01.Autowired.subsection02.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        BookService bookService = context.getBean("SetterService",BookService.class);
        bookService.findAllBook().forEach(System.out::println);

        System.out.println("1번 책: " + bookService.findBookBySerquenceOf(1));
    }
}
