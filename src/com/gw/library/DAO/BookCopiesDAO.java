package com.gw.library.DAO;

import com.gw.library.entity.BookCopies;
import com.gw.library.entity.Borrower;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookCopiesDAO extends BaseDAO<BookCopies> {
    public BookCopiesDAO(Connection conn){
        super(conn);
    }

    public void addBookCopy(BookCopies bookCopy) throws SQLException {
        save("INSERT INTO tbl_book_copies VALUES (?, ?, ?)", new Object[] {bookCopy.getBook().getId(), bookCopy.getBranch().getId(), bookCopy.getNumCopies()});
    }

    public void updateBookCopyInfo(BookCopies bookCopy) throws SQLException {
        save("UPDATE tbl_book_copies SET noOfCopies = ? WHERE bookId = ? AND branchId = ?", new Object[] {bookCopy.getNumCopies(), bookCopy.getBook().getId(), bookCopy.getBranch().getId()});
    }

    public void deleteBookCopy(BookCopies bookCopy) throws SQLException {
        save("DELETE FROM tbl_book_copies WHERE bookId = ? AND branchId = ?", new Object[] {bookCopy.getBook().getId(), bookCopy.getBranch().getId()});
    }

    public List<BookCopies> readAllBookCopies() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_book_copies", null);
    }

    @Override
    public List<BookCopies> extractData(ResultSet rs) throws SQLException {
        List<BookCopies> bookCopies = new ArrayList<>();
        while(rs.next()){
            BookCopies bc = new BookCopies();
            bc.getBook().setId(rs.getInt("bookId"));
            bc.getBranch().setId(rs.getInt("branchId"));
            bc.setNumCopies(rs.getInt("noOfCopies"));
            bookCopies.add(bc);
        }
        return bookCopies;
    }
}