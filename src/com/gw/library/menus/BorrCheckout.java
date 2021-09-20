package com.gw.library.menus;

import com.gw.library.entity.Branch;
import com.gw.library.service.BranchService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BorrCheckout {
    public static void menu() throws SQLException {
        while(true){
            List<Branch> branchList = new ArrayList<>();
            branchList = BranchService.readAllBranches();

            for(int i = 1; i <= branchList.size(); i++){
                System.out.println(i + ") " + branchList.get(i - 1).getName());
            }
            System.out.println("0) Back");

            int option = Selection.getOption();
            if(option == 0){
                return;
            }
            else if(option >= 1){
                Branch chosenBranch = new Branch();
                chosenBranch = branchList.get(option - 1);
                while(true) {
                    System.out.println("Search books in branch " + chosenBranch.getId() + " not implemented");
                    System.out.println("0) Cancel operation");

                    int option2 = Selection.getOption();
                    if (option2 == 0) {
                        return;
                    } else if (option2 >= 1) {
                        //add entry into book_loans, date out should be today, due in 1 week, reduce available copies by 1
                        System.out.println("BookID: " + option + " 'checked out' from " + chosenBranch.getName());
                        return;
                    }
                }
            }
        }
    }
}
