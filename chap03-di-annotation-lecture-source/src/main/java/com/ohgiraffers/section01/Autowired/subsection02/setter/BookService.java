package com.ohgiraffers.section01.Autowired.subsection02.setter;

import com.ohgiraffers.section01.common.BookDAO;
import com.ohgiraffers.section01.common.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("SetterService")
public class BookService {

    private BookDAO bookDAO;

    /* 설명. Setter 추가 */
    @Autowired
    public void setBookDAO(BookDAO bookDAO) {
        System.out.println("setter 활용");
        this.bookDAO = bookDAO;
    }

    public List<BookDTO> findAllBook() {
        return bookDAO.findAllBook();
    }

    public BookDTO findBookBySerquenceOf(int sequence) {
        return bookDAO.findBookBySequenceOf(sequence);
    }
}
