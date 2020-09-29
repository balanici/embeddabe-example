package com.balanici.embeddabeexample.service.impl;

import com.balanici.embeddabeexample.models.Book;
import com.balanici.embeddabeexample.repository.BookRepository;
import com.balanici.embeddabeexample.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findByName(String name) {
        return bookRepository.findAllByBookId_Name(name);
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return bookRepository.findAllByBookId_Author(author);
    }
}
