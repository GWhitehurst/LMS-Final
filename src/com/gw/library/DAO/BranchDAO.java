package com.gw.library.DAO;

import com.gw.library.entity.Branch;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BranchDAO extends BaseDAO<Branch> {
    public BranchDAO(Connection conn){
        super(conn);
    }

    public void addBranch(Branch branch) throws SQLException {
        save("INSERT INTO tbl_library_branch VALUES (?, ?, ?)", new Object[] {branch.getId(), branch.getName(), branch.getAddress()});
    }

    public void updateBranchInfo(Branch branch) throws SQLException {
        save("UPDATE tbl_library_branch SET branchName = ?, branchAddress = ? WHERE branchId = ?", new Object[] {branch.getName(), branch.getAddress(), branch.getId()});
    }

    public void deleteBranch(Branch branch) throws SQLException {
        save("DELETE FROM tbl_library_branch WHERE branchId = ?", new Object[] {branch.getId()});
    }

    public List<Branch> readAllBranches() throws SQLException, ClassNotFoundException {
        return read("SELECT * FROM tbl_library_branch", null);
    }

    @Override
    public List<Branch> extractData(ResultSet rs) throws SQLException {
        List<Branch> branches = new ArrayList<>();
        while(rs.next()){
            Branch b = new Branch();
            b.setId(rs.getInt("branchId"));
            b.setName(rs.getString("branchName"));
            b.setAddress(rs.getString("branchAddress"));
            branches.add(b);
        }
        return branches;
    }
}
