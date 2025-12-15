package com.ohgiraffers.section01.common;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class BookDTO {
    private int sequence;
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private java.util.Date createDate;
}
