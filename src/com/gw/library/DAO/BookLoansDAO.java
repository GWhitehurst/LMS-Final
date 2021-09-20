package com.gw.library.DAO;

import com.gw.library.entity.BookLoans;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookLoansDAO extends BaseDAO<BookLoans> {
    public BookLoansDAO(Connection conn){
        super(conn);
    }

    public void addBookLoan(BookLoans bookLoan) throws SQLException {
        save("INSERT INTO tbl_book_loans VALUES (?, ?, ?, ?, ?)", new Object[] {bookLoan.getBook().getId(), bookLoan.getBranch().getId(), bookLoan.getBorrower().getCardNum(), bookLoan.getDateOut(), bookLoan.getDateDue()});
    }

    public void updateBookLoanInfo(BookLoans bookLoan) throws SQLException {
        save("UPDATE tbl_book_loans SET dueDate = ? WHERE bookId = ? AND cardNo = ?", new Object[] {bookLoan.getDateDue(), bookLoan.getBook().getId(), bookLoan.getBorrower().getCardNum()});
    }

    public void deleteBookLoan(BookLoans bookLoan) throws SQLException {
        save("DELETE FROM tbl_book_loans WHERE bookId = ? AND cardNo = ? AND dateOut = ?", new Object[] {bookLoan.getBook().getId(), bookLoan.getBorrower().getCardNum(), bookLoan.getDateOut()});
    }

    public List<BookLoans> readAllBookLoans() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_book_loans", null);
    }

    @Override
    public List<BookLoans> extractData(ResultSet rs) throws SQLException {
        List<BookLoans> bookLoans = new ArrayList<>();
        while(rs.next()){
            BookLoans bl = new BookLoans();
            bl.getBook().setId(rs.getInt("bookId"));
            bl.getBranch().setId(rs.getInt("branchId"));
            bl.getBorrower().setCardNum(rs.getInt("cardNo"));
            bl.setDateOut(rs.getString("dateOut"));
            bl.setDateDue(rs.getString("dueDate"));
            bookLoans.add(bl);
        }
        return bookLoans;
    }
}
