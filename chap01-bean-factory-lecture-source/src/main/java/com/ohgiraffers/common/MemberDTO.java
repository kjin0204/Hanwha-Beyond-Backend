package com.ohgiraffers.common;

import lombok.*;

//@NoArgsConstructor
//@AllArgsConstructor
//@Setter
//@Getter
//@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberDTO {
    private int sequence;
    private String id;
    private String pawd;
    private String name;

}
