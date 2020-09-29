package com.balanici.embeddabeexample.service;

import com.balanici.embeddabeexample.models.Book;

import java.util.List;

public interface BookService {

    List<Book> findByName(String name);

    List<Book> findByAuthor(String author);
}
