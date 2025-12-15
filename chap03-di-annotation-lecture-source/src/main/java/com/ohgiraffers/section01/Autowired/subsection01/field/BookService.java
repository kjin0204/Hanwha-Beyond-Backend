package com.ohgiraffers.section01.Autowired.subsection01.field;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {


    /* 설명. 1. 필드 주입방식 */
//    @Autowired
//    private BookDAO bookDAO;

    /* 설명. 2. setter 주입 방식 */
//    private BookDAO bookDAO;
//
//    @Autowired
//    public void setBookDAO(BookDAO bookDAO) {
//        this.bookDAO = bookDAO;
//    }

    /* 설명. 3. 생성자 주입 방식 */
    private BookDAO bookDAO;

    @Autowired
    public BookService(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySerquenceOf(int sequence) {
        return bookDAO.findBookBySequenceOf(sequence);
    }
}
