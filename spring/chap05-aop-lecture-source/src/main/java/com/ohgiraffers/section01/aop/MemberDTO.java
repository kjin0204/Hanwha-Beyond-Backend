package com.ohgiraffers.section01.aop;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberDTO {
    private Long id;        // Null이 들어갈 수 도 있으면 Wrapper 클래스를 사용
    private String name;
}
