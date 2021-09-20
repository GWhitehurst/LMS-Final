package com.gw.library.menus;

public class AdminPublisher {
    public static void menu(){
        System.out.println("Select operation for Publisher");

        switch(Selection.getCRUD()){
            case 1:
                //Add publisher
                System.out.println("Add publisher not implemented");
                break;
            case 2:
                //Update publisher
                System.out.println("Update publisher not implemented");
                break;
            case 3:
                //Delete publisher
                System.out.println("Delete publisher not implemented");
                break;
            case 4:
                //Read publisher
                System.out.println("Read publisher not implemented");
                break;
            case 0:
                return;
        }
    }
}
