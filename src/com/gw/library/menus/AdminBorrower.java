package com.gw.library.menus;

public class AdminBorrower {
    public static void menu(){
        System.out.println("Select operation for Borrower");

        switch(Selection.getCRUD()){
            case 1:
                //Add borrower
                break;
            case 2:
                //Update borrower
                break;
            case 3:
                //Delete borrower
                break;
            case 4:
                //Read borrower
                break;
            case 0:
                return;
        }
    }
}
