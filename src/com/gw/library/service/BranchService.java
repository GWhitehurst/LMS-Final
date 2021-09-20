package com.gw.library.service;

import com.gw.library.DAO.BranchDAO;
import com.gw.library.entity.Branch;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BranchService {
    public static List<Branch> readAllBranches() throws SQLException {
        Connection conn = null;
        List<Branch> branches = new ArrayList<>();

        try {
            conn = Util.getConnection();
            BranchDAO bdao = new BranchDAO(conn);
            branches = bdao.readAllBranches();
            conn.commit();
        } catch (ClassNotFoundException e) {
            System.out.println("Hit exception in BranchService ClassNotFound");
            conn.rollback();
        } catch (SQLException e) {
            System.out.println("Hit exception in BranchService SQLException");
            conn.rollback();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return branches;
    }

    public static void addBranch(String name, String address) throws SQLException {
        Connection conn = null;

        try {
            conn = Util.getConnection();
            BranchDAO bdao = new BranchDAO(conn);
            Branch newBranch = new Branch();
            List<Branch> branches = new ArrayList<>();
            branches = bdao.readAllBranches();

            newBranch.setId(branches.get(branches.size() - 1).getId() + 1); //Set new ID to 1 more than the largest id
            newBranch.setName(name);
            newBranch.setAddress(address);
            bdao.addBranch(newBranch);
        } catch (ClassNotFoundException e) {
            System.out.println("Error adding new branch");
            conn.rollback();
        } catch (SQLException e) {
            System.out.println("Error adding new branch");
            conn.rollback();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void updateBranch(int id, String name, String address) throws SQLException {
        Connection conn = null;

        try {
            conn = Util.getConnection();
            BranchDAO bdao = new BranchDAO(conn);
            Branch updatedBranch = new Branch();

            updatedBranch.setId(id);
            updatedBranch.setName(name);
            updatedBranch.setAddress(address);
            bdao.updateBranchInfo(updatedBranch);
        } catch (ClassNotFoundException e) {
            System.out.println("Error updating branch");
            conn.rollback();
        } catch (SQLException e) {
            System.out.println("Error updating branch");
            conn.rollback();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }

    public static void deleteBranch(int id) throws SQLException {
        Connection conn = null;

        try {
            conn = Util.getConnection();
            BranchDAO bdao = new BranchDAO(conn);
            Branch deleteBranch = new Branch();
            deleteBranch.setId(id);

            bdao.deleteBranch(deleteBranch);
        } catch (ClassNotFoundException e) {
            System.out.println("Error deleting branch");
            conn.rollback();
        } catch (SQLException e) {
            System.out.println("Error deleting branch");
            conn.rollback();
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
    }
}
