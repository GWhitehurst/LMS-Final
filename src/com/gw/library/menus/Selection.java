package com.gw.library.menus;

import java.util.Scanner;

public class Selection {
    private static final String quit = "qqq";

    public static int getOption(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals(quit)) System.exit(0);
        else if(input.equals("")) return -1;
        int option;
        try {
            option = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return -1;
        }
        return option;
    }

    public static int getCRUD(){
        while(true) {
            System.out.println("1) Add\n2) Update\n3) Delete\n4) Read\n0) Back");
            int option = getOption();
            if (option >= 0 && option <= 4) {
                return option;
            }
        }
    }
}
