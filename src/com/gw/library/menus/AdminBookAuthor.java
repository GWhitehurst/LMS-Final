package com.gw.library.menus;

public class AdminBookAuthor {
    public static void menu(){
        System.out.println("Select operation for Book-Author");

        switch(Selection.getCRUD()){
            case 1:
                //Add book and author
                break;
            case 2:
                //Update book and author
                break;
            case 3:
                //Delete book
                break;
            case 4:
                //Read book and author
                break;
            case 0:
                return;
        }
    }
}
