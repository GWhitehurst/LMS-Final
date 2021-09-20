package com.gw.library.menus;

public class Admin1 {
    public static void menu() {
        while(true){
            System.out.println("1) Add/Update/Delete/Read Book and Author");
            System.out.println("2) Add/Update/Delete/Read Genres");
            System.out.println("3) Add/Update/Delete/Read Publishers");
            System.out.println("4) Add/Update/Delete/Read Library Branches");
            System.out.println("5) Add/Update/Delete/Read Borrowers");
            System.out.println("6) Override Due Date for Loan");
            System.out.println("0) Back");

            switch(Selection.getOption()) {
                case 1:
                    AdminBookAuthor.menu();
                    break;
                case 2:
                    AdminGenre.menu();
                    break;
                case 3:
                    AdminPublisher.menu();
                    break;
                case 4:
                    AdminBranch.menu();
                    break;
                case 5:
                    AdminBorrower.menu();
                    break;
                case 6:
                    AdminOverride.menu();
                    break;
                case 0:
                    System.out.println("Going back");
                    return;
                default:
                    System.out.println("Invalid selection");
                    continue;
            }
        }
    }
}
