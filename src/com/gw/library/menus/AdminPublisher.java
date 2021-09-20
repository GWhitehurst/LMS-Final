package com.gw.library.menus;

public class AdminPublisher {
    public static void menu(){
        System.out.println("Select operation for Publisher");

        switch(Selection.getCRUD()){
            case 1:
                //Add publisher
                break;
            case 2:
                //Update publisher
                break;
            case 3:
                //Delete publisher
                break;
            case 4:
                //Read publisher
                break;
            case 0:
                return;
        }
    }
}
