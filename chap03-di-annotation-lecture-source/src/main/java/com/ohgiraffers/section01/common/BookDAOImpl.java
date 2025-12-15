package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class BookDAOImpl implements BookDAO {

    private Map<Integer, BookDTO> books;

    public BookDAOImpl() {
        books = new HashMap<>();
        books.put(1,
                new BookDTO(1, 123456, "자바의 정석"
                        , "남궁성", "도우출판", new java.util.Date()));
        books.put(2,
                new BookDTO(2, 223344, "칭찬은 고래도 춤추게 한다.",
                        "고래", "고래출판", new java.util.Date()));
    }

    @Override
    public List<BookDTO> findAllBook() {
        /* 설명. Map을 List형태로 변환(feat. Collection 타입을 List형태로 바꾸는 생성자 활용) */
        return new ArrayList<>(books.values());
    }

    @Override
    public BookDTO findBookBySequenceOf(int sequence) {
        return books.get(sequence);
    }
}
