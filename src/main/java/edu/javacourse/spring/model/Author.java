package edu.javacourse.spring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by enibeni on 25.11.15.
 */
@Entity
@Table(name = "authors")
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private int author_id;

    @Column(name = "fname", nullable = true)
    private String fname;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY, mappedBy = "authorList")
    private Set<Book> bookList;

    public Author(){}

    public Author(String fname) {
        this.fname = fname;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Set<Book> getBookList() {
        return bookList;
    }

    public void setBookList(Set<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return author_id + ":" + fname;
    }
}
