package com.balanici.embeddabeexample.repository;

import com.balanici.embeddabeexample.models.Book;
import com.balanici.embeddabeexample.models.BookId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, BookId> {

    List<Book> findAllByBookId_Name(String name);

    List<Book> findAllByBookId_Author(String author);
}
