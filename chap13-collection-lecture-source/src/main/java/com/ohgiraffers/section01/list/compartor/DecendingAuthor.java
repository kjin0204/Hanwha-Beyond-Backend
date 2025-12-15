package com.ohgiraffers.section01.list.compartor;

import com.ohgiraffers.section01.list.DTO.BookDTO;

import java.util.Comparator;

public class DecendingAuthor implements Comparator<BookDTO> {

    @Override
    public int compare(BookDTO o1, BookDTO o2) {
        return o1.getAuthor().compareTo(o2.getAuthor());
    }
}
