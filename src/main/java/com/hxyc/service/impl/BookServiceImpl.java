package com.hxyc.service.impl;

import com.hxyc.dao.BookDao;
import com.hxyc.pojo.Books;
import com.hxyc.service.BookService;

import java.util.List;

/**
 * creater: 13116
 * create time: 2021/1/13
 * describe:
 */
public class BookServiceImpl implements BookService {

    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookDao bookDao;


    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public int addBook(Books book) {
        return bookDao.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookDao.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookDao.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookDao.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookDao.queryAllBook();
    }

    @Override
    public Books queryBookByName(String bookName) {
        return bookDao.queryBookByName(bookName);
    }


}
