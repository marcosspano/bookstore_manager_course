package com.marcosspano.bookstoremanager.controller;

import com.marcosspano.bookstoremanager.dto.MessageResponseDTO;
import com.marcosspano.bookstoremanager.entity.Book;
import com.marcosspano.bookstoremanager.repository.BookRepository;
import com.marcosspano.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO create(@RequestBody Book book) {
        return bookService.create(book);
    }


}
