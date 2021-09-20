package com.gw.library.entity;

import java.util.List;
import java.util.Objects;

public class Book {
    private int id;
    private String title;
    private Publisher publisher;
    private Author author;
    private List<BookAuthors> bookAuthorList;
    private List<BookLoans> bookLoanList;
    private List<BookCopies> bookCopyList;
    private List<BookGenres> bookGenreList;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<BookAuthors> getBookAuthorList() {
        return bookAuthorList;
    }

    public void setBookAuthorList(List<BookAuthors> bookAuthorList) {
        this.bookAuthorList = bookAuthorList;
    }

    public List<BookLoans> getBookLoanList() {
        return bookLoanList;
    }

    public void setBookLoanList(List<BookLoans> bookLoanList) {
        this.bookLoanList = bookLoanList;
    }

    public List<BookCopies> getBookCopyList() {
        return bookCopyList;
    }

    public void setBookCopyList(List<BookCopies> bookCopyList) {
        this.bookCopyList = bookCopyList;
    }

    public List<BookGenres> getBookGenreList() {
        return bookGenreList;
    }

    public void setBookGenreList(List<BookGenres> bookGenreList) {
        this.bookGenreList = bookGenreList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getPublisher(), getBookAuthorList(), getBookLoanList(), getBookCopyList(), getBookGenreList());
    }
}
