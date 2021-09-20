package com.gw.library.menus;

public class AdminBranch {
    public static void menu(){
        System.out.println("Select operation for Branch");

        switch(Selection.getCRUD()){
            case 1:
                //Add branch
                break;
            case 2:
                //Update branch
                break;
            case 3:
                //Delete branch
                break;
            case 4:
                //Read branch
                break;
            case 0:
                return;
        }
    }
}
