package com.ibrahimkuley.dao;

import com.ibrahimkuley.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hikuley on 02.11.2014.
 */
public class BookDAOImpl implements BookDAO {

    @Override
    public List bookList() {

        List bookList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            Book book = new Book();
            book.setId(12);
            book.setName("Sah Ve Sultan");
            book.setAuthor("Halil İbrahim Küley");
            book.setWriteTime("12.15.25");
            bookList.add(book);
        }
        return bookList;
    }
}
