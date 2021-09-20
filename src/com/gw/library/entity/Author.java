package com.gw.library.entity;

import java.util.List;
import java.util.Objects;

public class Author {
    private int id;
    private String name;
    private List<BookAuthors> bookAuthorList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<BookAuthors> getBookAuthorList() {
        return bookAuthorList;
    }

    public void setBookAuthorList(List<BookAuthors> bookAuthorList) {
        this.bookAuthorList = bookAuthorList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getBookAuthorList());
    }
}
