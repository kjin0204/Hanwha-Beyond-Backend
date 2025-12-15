package com.ohgiraffers.transactional.section01.annotation;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
/* 설명. 하나의 메뉴에 대한 주문건을 담는 DTO */
public class OrderMenuDTO {
    private int menuCode;       // 고객이 주문하는 메뉴 번호
    private int orderAmount;    // 주문한 메뉴 수량
}
