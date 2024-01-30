package com.tolga.pinsoftproject1.bussines.concrates;


import com.tolga.pinsoftproject1.bussines.abstracts.BookService;
import com.tolga.pinsoftproject1.dataAccess.abstracts.BookDao;
import com.tolga.pinsoftproject1.entities.concrates.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager implements BookService {

    private BookDao bookDao ;

    @Autowired
    public BookManager(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.findAll();
    }


}
