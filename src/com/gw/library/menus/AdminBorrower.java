package com.gw.library.menus;

public class AdminBorrower {
    public static void menu(){
        System.out.println("Select operation for Borrower");

        switch(Selection.getCRUD()){
            case 1:
                //Add borrower
                System.out.println("Add borrower not implemented");
                break;
            case 2:
                //Update borrower
                System.out.println("Update borrower not implemented");
                break;
            case 3:
                //Delete borrower
                System.out.println("Delete borrower not implemented");
                break;
            case 4:
                //Read borrower
                System.out.println("Read borrower not implemented");
                break;
            case 0:
                return;
        }
    }
}
