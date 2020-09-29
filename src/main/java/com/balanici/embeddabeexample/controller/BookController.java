package com.balanici.embeddabeexample.controller;

import com.balanici.embeddabeexample.models.Book;
import com.balanici.embeddabeexample.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/by-author/{author}")
    public ResponseEntity<List<Book>> getBooksByAuthor(@PathVariable(name = "author") String author ) {
        return ResponseEntity.ok()
                .body(bookService.findByAuthor(author));
    }

    @GetMapping("/by-name/{name}")
    public ResponseEntity<List<Book>> getBooksByName(@PathVariable(name = "name") String anme) {
        return ResponseEntity.ok()
                .body(bookService.findByName(anme));
    }
}
