package com.gw.library.menus;

import java.sql.SQLException;
import java.util.Scanner;

public class Borr1 {
    public static void menu() {
        while(true){
            System.out.println("1) Check out a book\n2) Return a book\n0) Back");

            switch(Selection.getOption()) {
                case 1:
                    try {
                        BorrCheckout.menu();
                    } catch (SQLException e) {
                        System.out.println("Error checking out book");
                    }
                    break;
                case 2:
                    try{
                        BorrReturn.menu();
                    } catch (SQLException e){
                        System.out.println("Error returning book");
                    }
                    break;
                case 0:
                    System.out.println("Going back");
                    return;
            }
        }
    }
}
