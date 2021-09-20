package com.gw.library.DAO;

import com.gw.library.entity.Author;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO extends BaseDAO<Author>{
    public AuthorDAO(Connection conn){
        super(conn);
    }

    public void addAuthor(Author author) throws SQLException {
        save("INSERT INTO tbl_author VALUES (?, ?)", new Object[] {author.getId(), author.getName()});
    }

    public void updateAuthorName(Author author) throws SQLException {
        save("UPDATE tbl_author SET authorName = ? WHERE authorId = ?", new Object[] {author.getName(), author.getId()});
    }

    public void deleteAuthor(Author author) throws SQLException {
        save("DELETE FROM tbl_author WHERE authorId = ?", new Object[] {author.getId()});
    }

    public List<Author> readAllAuthors() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_author", null);
    }

    @Override
    public List<Author> extractData(ResultSet rs) throws SQLException {
        List<Author> authors = new ArrayList<>();
        while(rs.next()){
            Author a = new Author();
            a.setId(rs.getInt("authorId"));
            a.setName(rs.getString("authorName"));
            authors.add(a);
        }
        return authors;
    }
}
