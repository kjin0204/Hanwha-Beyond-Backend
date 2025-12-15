package com.ohgiraffers.section01.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        System.out.println("===== 회원 전체 조회 =====");
        MemberService memberService = context.getBean(MemberService.class);
        memberService.findAllMembers().forEach(System.out::println);

        System.out.println("===== 회원 한명 조회 =====");
        System.out.println(memberService.findMemberBy(1));


//        System.out.println("===== AfterThrowing Advice 확인용 요청 =====");
//        System.out.println(memberService.findMemberBy(3));
    }
}
