package com.tolga.pinsoftproject1.controllers;


import com.tolga.pinsoftproject1.bussines.abstracts.BookService;
import com.tolga.pinsoftproject1.bussines.abstracts.CarService;
import com.tolga.pinsoftproject1.entities.concrates.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@CrossOrigin
public class BookController {


    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/getBooks")
    public List<Book> getBooks(){
        return this.bookService.getAll();
    }
}
