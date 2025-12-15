package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    /* 설명. 메소드명이 기본 bean의 이름이 되고, 다른 이름을 하고 싶으면 어노테이션에 이름을 작성할 수 있다. */
    //1. 생성자 주입
//    @Bean(name = "member")
//    public MemberDTO getMember() {
//        return new MemberDTO(1, "user01", "pass01", "홍길동");
//    }

    // 2. 셋터 주입
    @Bean(name = "member")
    public MemberDTO getMember() {
        MemberDTO member = new MemberDTO();
        member.setSequence(2);
        member.setName("유관순");
        member.setId("user02");
        member.setPawd("pass02");
        return member;
    }
}
