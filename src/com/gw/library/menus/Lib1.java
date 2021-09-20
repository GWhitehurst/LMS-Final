package com.gw.library.menus;

import java.sql.SQLException;

public class Lib1 {
    public static void menu() {
        while(true){
            System.out.println("1) Enter your branch\n0) Back");

            switch(Selection.getOption()) {
                case 1:
                    try { Lib2.menu(); }
                    catch (SQLException e) { System.out.println("Error accessing branches"); }
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
