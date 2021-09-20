package com.gw.library.menus;

public class AdminGenre {
    public static void menu(){
        System.out.println("Select operation for Genre");

        switch(Selection.getCRUD()){
            case 1:
                //Add genre
                break;
            case 2:
                //Update genre
                break;
            case 3:
                //Delete genre
                break;
            case 4:
                //Read genre
                break;
            case 0:
                return;
        }
    }
}
