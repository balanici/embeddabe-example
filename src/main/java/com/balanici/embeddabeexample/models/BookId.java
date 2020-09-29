package com.balanici.embeddabeexample.models;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class BookId implements Serializable {

    private String author;

    private String name;

}
