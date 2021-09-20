package com.gw.library.DAO;

import com.gw.library.entity.BookGenres;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookGenresDAO extends BaseDAO<BookGenres> {
    public BookGenresDAO(Connection conn){
        super(conn);
    }

    public void addBookGenre(BookGenres bookGenre) throws SQLException {
        save("INSERT INTO tbl_book_genres VALUES (?, ?)", new Object[] {bookGenre.getGenre().getId(), bookGenre.getBook().getId()});
    }

    public void deleteBookGenre(BookGenres bookGenre) throws SQLException {
        save("DELETE FROM tbl_book_genres WHERE bookId = ? AND genre_id = ?", new Object[] {bookGenre.getBook().getId(), bookGenre.getGenre().getId()});
    }

    public List<BookGenres> readAllBookGenres() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_book_genres", null);
    }

    @Override
    public List<BookGenres> extractData(ResultSet rs) throws SQLException {
        List<BookGenres> bookGenres = new ArrayList<>();
        while(rs.next()){
            BookGenres bg = new BookGenres();
            bg.getBook().setId(rs.getInt("bookId"));
            bg.getGenre().setId(rs.getInt("genre_id"));
            bookGenres.add(bg);
        }
        return bookGenres;
    }
}
