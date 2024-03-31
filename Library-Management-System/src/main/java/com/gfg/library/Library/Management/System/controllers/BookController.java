package com.gfg.library.Library.Management.System.controllers;

import com.gfg.library.Library.Management.System.model.Book;
import com.gfg.library.Library.Management.System.request.CreateBookRequest;
import com.gfg.library.Library.Management.System.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/createBook")
    @PostMapping
    public Book createBook(@RequestBody(required = false) CreateBookRequest createBookRequest){
        Book book = bookService.createBook(createBookRequest);
        return book;
    }
}
