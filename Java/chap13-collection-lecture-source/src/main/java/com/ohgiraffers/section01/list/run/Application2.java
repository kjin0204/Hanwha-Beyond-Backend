package com.ohgiraffers.section01.list.run;

import com.ohgiraffers.section01.list.DTO.BookDTO;
import com.ohgiraffers.section01.list.compartor.DecendingAuthor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {

        List<BookDTO> bookList = new ArrayList<>();
        bookList.add(new BookDTO(1,"홍길동전","허균",50000));
        bookList.add(new BookDTO(2,"목민심서","정약용",30000));
        bookList.add(new BookDTO(3,"동의보감","허준",50400));
        bookList.add(new BookDTO(4,"삼국사기","김부식",46000));
        bookList.add(new BookDTO(5,"삼국유사","일연",58000));

        System.out.println("====== 정렬전 ======");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }

        /* 설명. Camparable 인터페이스를 구현한 해당 클래스 기준 정렬 외에도 Comparator를 구현한 별도의 정렬 기준도 가능 */
        // 객체 안에 정의한 ComparTo() 기준으로 정렬
//        Collections.sort(bookList);

        // 정의 기준을 정의한 클래스의 compare() 기준으로 정렬
        Collections.sort(bookList,new DecendingAuthor());

        /* 설명. List 계열도 sort 메소드를 사용할 수 있으며 Comparator를 구현한 인스턴스 여부만 판단하면 된다. */
        bookList.sort(null);// 자신이 지닌 자신의
        bookList.sort(new DecendingAuthor());

        System.out.println("====== 정렬후 ======");
        for(BookDTO book : bookList){
            System.out.println(book);
        }
    }
}
