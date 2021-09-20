package com.gw.library.menus;

import java.util.Scanner;

public class Lib3Entry {
    private static String doNothing = "N/A";
    private static String quit = "qqq";
    private static String stop = "quit";

    public static String getInput(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(input.equals(quit)) System.exit(0);
        else if(input.equals("")) return null;
        else if(input.toUpperCase().equals(doNothing)) return null;
        else if(input.toLowerCase().equals(stop)) return "quit";

        return input;
    }

    public static int getPosInt(){
        Scanner sc = new Scanner(System.in);
        while(true) {
            int input = sc.nextInt();
            if (input >= 0) {
                return input;
            }
        }
    }
}
