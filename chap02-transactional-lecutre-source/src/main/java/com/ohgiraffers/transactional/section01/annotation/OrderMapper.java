package com.ohgiraffers.transactional.section01.annotation;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    void insertOrder(Order order);

    void registOrderMenu(OrderMenu orderMenu);

    void registOrderMenuList(List<OrderMenu> orderMenus);
}
