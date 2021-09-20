package com.gw.library.entity;

import java.util.List;

public class Borrower {
    private int cardNum;
    private String name;
    private String address;
    private String phone;
    private List<BookLoans> bookLoanList;

    public int getCardNum() {
        return cardNum;
    }

    public void setCardNum(int cardNum) {
        this.cardNum = cardNum;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<BookLoans> getBookLoanList() {
        return bookLoanList;
    }

    public void setBookLoanList(List<BookLoans> bookLoanList) {
        this.bookLoanList = bookLoanList;
    }
}
