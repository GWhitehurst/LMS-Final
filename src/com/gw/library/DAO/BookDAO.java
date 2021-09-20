package com.gw.library.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.gw.library.entity.Book;

public class BookDAO extends BaseDAO<Book>{
    public BookDAO(Connection conn){
        super(conn);
    }

    public void addBook(Book book) throws SQLException {
        save("INSERT INTO tbl_book VALUES (?, ?, ?, ?)", new Object[] {book.getId(), book.getTitle(), book.getAuthor().getId(), book.getPublisher().getId()});
    }

    public void updateBook(Book book) throws SQLException {
        save("UPDATE tbl_book SET title = ?, authId = ?, pubId = ? WHERE bookId = ?", new Object[] {book.getTitle(), book.getAuthor().getId(), book.getPublisher().getId(), book.getId()});
    }

    public void deleteBook(Book book) throws SQLException {
        save("DELETE FROM tbl_book WHERE bookId = ?", new Object[] {book.getId()});
    }

    public List<Book> readAllBooks() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_book", null);
    }

    @Override
    public List<Book> extractData(ResultSet rs) throws SQLException {
        List<Book> books = new ArrayList<>();
        while(rs.next()){
            Book b = new Book();
            b.setId(rs.getInt("bookId"));
            b.setTitle(rs.getString("title"));
            b.getAuthor().setId(rs.getInt("authId"));
            b.getPublisher().setId(rs.getInt("pubId"));
            books.add(b);
        }
        return books;
    }
}
