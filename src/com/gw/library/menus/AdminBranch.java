package com.gw.library.menus;

public class AdminBranch {
    public static void menu(){
        System.out.println("Select operation for Branch");

        switch(Selection.getCRUD()){
            case 1:
                //Add branch
                System.out.println("Add branch not implemented");
                break;
            case 2:
                //Update branch
                System.out.println("Update branch not implemented");
                break;
            case 3:
                //Delete branch
                System.out.println("Delete branch not implemented");
                break;
            case 4:
                //Read branch
                System.out.println("Read branch not implemented");
                break;
            case 0:
                return;
        }
    }
}
