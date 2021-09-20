package com.gw.library.entity;

import java.util.List;

public class Branch {
    private int id;
    private String name;
    private String address;
    private List<BookLoans> bookLoanList;
    private List<BookCopies> bookCopyList;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
}
