package com.gw.library.menus;

public class Main {

    public static void main(String[] args) {

        while(true){
            System.out.println("Welcome to the SS Library Management System. Which category of a user are you?");
            System.out.println("1) Librarian\n2) Administrator\n3) Borrower\n0) Exit");

            switch(Selection.getOption()) {
                case 1:
                    Lib1.menu();
                    break;
                case 2:
                    Admin1.menu();
                    break;
                case 3:
                    Borr1.menu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection");
                    continue;
            }
        }
    }
}
