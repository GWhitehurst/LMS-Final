package com.gw.library.entity;

import java.util.List;

public class Genre {
    private int id;
    private String name;
    private List<BookGenres> bookGenreList;

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

    public List<BookGenres> getBookGenreList() {
        return bookGenreList;
    }

    public void setBookGenreList(List<BookGenres> bookGenreList) {
        this.bookGenreList = bookGenreList;
    }
}