package com.balanici.embeddabeexample.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @EmbeddedId
    private BookId bookId;

    @Column(name = "genre")
    private String genre;

    @Column(name = "price")
    private Integer price;

}
