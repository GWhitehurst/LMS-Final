package com.gw.library.DAO;

import com.gw.library.entity.Borrower;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BorrowerDAO extends BaseDAO<Borrower>{
    public BorrowerDAO(Connection conn){
        super(conn);
    }

    public void addBorrower(Borrower borrower) throws SQLException {
        save("INSERT INTO tbl_borrower VALUES (?, ?, ?, ?)", new Object[] {borrower.getCardNum(), borrower.getName(), borrower.getAddress(), borrower.getPhone()});
    }

    public void updateBorrowerInfo(Borrower borrower) throws SQLException {
        save("UPDATE tbl_borrower SET name = ?, address = ?, phone = ? WHERE cardNo = ?", new Object[] {borrower.getName(), borrower.getAddress(), borrower.getPhone(), borrower.getCardNum()});
    }

    public void deleteAuthor(Borrower borrower) throws SQLException {
        save("DELETE FROM tbl_borrower WHERE cardNo = ?", new Object[] {borrower.getCardNum()});
    }

    public List<Borrower> readAllBorrowers() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_borrower", null);
    }

    @Override
    public List<Borrower> extractData(ResultSet rs) throws SQLException {
        List<Borrower> borrowers = new ArrayList<>();
        while(rs.next()){
            Borrower b = new Borrower();
            b.setCardNum(rs.getInt("cardNo"));
            b.setName(rs.getString("name"));
            b.setAddress(rs.getString("address"));
            b.setPhone(rs.getString("phone"));
            borrowers.add(b);
        }
        return borrowers;
    }
}
