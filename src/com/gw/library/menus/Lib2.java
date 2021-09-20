package com.gw.library.menus;

import com.gw.library.entity.Branch;
import com.gw.library.service.BranchService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Lib2 {
    public static void menu() throws SQLException {
        while(true){
            List<Branch> branchList = new ArrayList<>();
            branchList = BranchService.readAllBranches();

            for(int i = 1; i <= branchList.size(); i++){
                System.out.println(i + ") " + branchList.get(i - 1).getName());
            }
            System.out.println("0) Back");

            int option = Selection.getOption();
            if(option == 0) return;
            else if(option == -1) System.out.println("Invalid option");
            else Lib3.menu(branchList.get(option - 1));
        }
    }
}
