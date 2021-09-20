package com.gw.library.DAO;

import com.gw.library.entity.Genre;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GenreDAO extends BaseDAO<Genre> {
    public GenreDAO(Connection conn){
        super(conn);
    }

    public void addGenre(Genre genre) throws SQLException {
        save("INSERT INTO tbl_genre VALUES (?, ?)", new Object[] {genre.getId(), genre.getName()});
    }

    public void updateGenreName(Genre genre) throws SQLException {
        save("UPDATE tbl_genre SET genre_name = ? WHERE genre_id = ?", new Object[] {genre.getName(), genre.getId()});
    }

    public void deleteGenre(Genre genre) throws SQLException {
        save("DELETE FROM tbl_genre WHERE genre_id = ?", new Object[] {genre.getId()});
    }

    public List<Genre> readAllGenres() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_genre", null);
    }

    @Override
    public List<Genre> extractData(ResultSet rs) throws SQLException {
        List<Genre> genres = new ArrayList<>();
        while(rs.next()){
            Genre g = new Genre();
            g.setId(rs.getInt("genre_id"));
            g.setName(rs.getString("genre_name"));
            genres.add(g);
        }
        return genres;
    }
}
