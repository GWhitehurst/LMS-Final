package com.gw.library.DAO;

import com.gw.library.entity.Publisher;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PublisherDAO extends BaseDAO<Publisher> {
    public PublisherDAO(Connection conn){
        super(conn);
    }

    public void addPublisher(Publisher publisher) throws SQLException {
        save("INSERT INTO tbl_publisher VALUES (?, ?, ?, ?)", new Object[] {publisher.getId(), publisher.getName(), publisher.getAddress(), publisher.getPhone()});
    }

    public void updatePublisherInfo(Publisher publisher) throws SQLException {
        save("UPDATE tbl_publisher SET publisherName = ?, publisherAddress = ?, publisherPhone = ? WHERE publisherId = ?", new Object[] {publisher.getName(), publisher.getAddress(), publisher.getPhone(), publisher.getId()});
    }

    public void deletePublisher(Publisher publisher) throws SQLException {
        save("DELETE FROM tbl_publisher WHERE authorId = ?", new Object[] {publisher.getId()});
    }

    public List<Publisher> readAllPublishers() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_publisher", null);
    }

    @Override
    public List<Publisher> extractData(ResultSet rs) throws SQLException {
        List<Publisher> publishers = new ArrayList<>();
        while(rs.next()){
            Publisher p = new Publisher();
            p.setId(rs.getInt("publisherId"));
            p.setName(rs.getString("publisherName"));
            p.setAddress(rs.getString("publisherAddress"));
            p.setPhone(rs.getString("publisherPhone"));
            publishers.add(p);
        }
        return publishers;
    }
}
