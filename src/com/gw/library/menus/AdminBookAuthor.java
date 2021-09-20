package com.gw.library.menus;

public class AdminBookAuthor {
    public static void menu(){
        System.out.println("Select operation for Book-Author");

        switch(Selection.getCRUD()){
            case 1:
                //Add book and author
                System.out.println("Add book-author not implemented");
                break;
            case 2:
                //Update book and author
                System.out.println("Update book-author not implemented");
                break;
            case 3:
                //Delete book
                System.out.println("Delete book-author not implemented");
                break;
            case 4:
                //Read book and author
                System.out.println("Read book-author not implemented");
                break;
            case 0:
                return;
        }
    }
}
