package com.gw.library.DAO;

import com.gw.library.entity.BookAuthors;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookAuthorsDAO extends BaseDAO<BookAuthors> {
    public BookAuthorsDAO(Connection conn){
        super(conn);
    }

    public void addBookAuthor(BookAuthors bookAuthor) throws SQLException {
        save("INSERT INTO tbl_book_author VALUES (?, ?)", new Object[] {bookAuthor.getBook().getId(), bookAuthor.getAuthor().getId()});
    }

    public void deleteBookAuthor(BookAuthors bookAuthor) throws SQLException {
        save("DELETE FROM tbl_book_author WHERE bookId = ? AND authorId = ?", new Object[] {bookAuthor.getBook().getId(), bookAuthor.getAuthor().getId()});
    }

    public List<BookAuthors> readAllBookAuthors() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_publisher", null);
    }

    @Override
    public List<BookAuthors> extractData(ResultSet rs) throws SQLException {
        List<BookAuthors> bookAuthors = new ArrayList<>();
        while(rs.next()){
            BookAuthors ba = new BookAuthors();
            ba.getAuthor().setId(rs.getInt("authorId"));
            ba.getBook().setId(rs.getInt("bookId"));
            bookAuthors.add(ba);
        }
        return bookAuthors;
    }
}
