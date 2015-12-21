package edu.javacourse.spring.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by enibeni on 12.12.15.
 */
@Entity
@Table(name = "books")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int book_id;
    @Column(name = "title")
    private String title;
    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.LAZY)
    @JoinTable(name = "book_author_id",
                        joinColumns = @JoinColumn(name = "book_id"),
                        inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authorList;

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(Set<Author> authorList) {
        this.authorList = authorList;
    }

    @Override
    public String toString() {
        return "Book{" +
                "book_id=" + book_id +
                ", title='" + title + '\'' +
                ", authorList=" + authorList +
                '}';
    }
}
