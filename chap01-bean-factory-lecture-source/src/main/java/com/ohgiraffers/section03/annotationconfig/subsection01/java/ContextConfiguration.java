package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration("config")
/* 설명. 1. 기본적으로 설정파일이 있는 패키지 및 하위만 scan 하지만 basePackage를 바꾸면 다른 범위도 가능 하다. */
//@ComponentScan(basePackages = {"com.ohgiraffers", "com.ohgiraffers.section01"})

/* 설명. 2. 범위 및 필터를 적용해서 제외하고자 하는 bean을 등록하는 경우(excludeFilters) */
//@ComponentScan(basePackages = {"com.ohgiraffers", "com.ohgiraffers.section01"},
//        excludeFilters = {
//                @ComponentScan.Filter(
//                        /* 설명. 2-1. 타입으로 설정 */
////                        type = FilterType.ASSIGNABLE_TYPE,
////                        classes = {MemberDAO.class}
//
//                        /* 설명. 2-2 어노테이션 종류로 설정 */
//                        type = FilterType.ANNOTATION,
//                        classes = {org.springframework.stereotype.Repository.class}
//                )
//        })

/* 설명. 3. 범위 및 필터를 적용해서 포함(등록)하고자 하는 bean을 등록하는 경우(includeFilters) */
@ComponentScan(basePackages = {"com.ohgiraffers"},
        useDefaultFilters = false, // 현재 범위에 있는 bean들을 생성 하지 않음.
        includeFilters = { // 여기에 포함된 것들만 생성 함
                @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        classes = {MemberDAO.class}
                )
        })
public class ContextConfiguration {

}
