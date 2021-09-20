package com.gw.library.menus;

public class AdminGenre {
    public static void menu(){
        System.out.println("Select operation for Genre");

        switch(Selection.getCRUD()){
            case 1:
                //Add genre
                System.out.println("Add genre not implemented");
                break;
            case 2:
                //Update genre
                System.out.println("Update genre not implemented");
                break;
            case 3:
                //Delete genre
                System.out.println("Delete genre not implemented");
                break;
            case 4:
                //Read genre
                System.out.println("Read genre not implemented");
                break;
            case 0:
                return;
        }
    }
}
