package com.gw.library.menus;

import com.gw.library.entity.Branch;

public class Lib3 {
    public static void menu(Branch branch){
        while(true){
            System.out.println("1) Update the details of the library\n2) Add copies of a book to the branch");
            System.out.println("0) Back");

            switch(Selection.getOption()){
                case 1:
                    System.out.println("You have chosen to update the Branch with Branch Id: " + branch.getId() + " and Branch Name: " + branch.getName());
                    System.out.println("Enter \'quit\' at any prompt to cancel operation");

                    System.out.println("Please enter new branch name or enter N/A for no change:");
                    String newName = Lib3Entry.getInput();
                    if(newName != null && newName.equals("quit")) break;

                    System.out.println("Please enter new branch address or enter N/A for no change:");
                    String newAddress = Lib3Entry.getInput();
                    if(newAddress != null && newAddress.equals("quit")) break;

                    if(newName != null){
                        branch.setName(newName);
                    }
                    if(newAddress != null){
                        branch.setAddress(newAddress);
                    }

                    //update branch
                    System.out.println("'Updating' " + branch.getName() + " with Name: " + branch.getName() + " and Address: " + branch.getAddress());
                    break;
                case 2:
                    System.out.println("Pick the Book you want to add copies of to your branch:");
                    //List book-authors
                    System.out.println("0) Cancel operation");

                    int option = Selection.getOption();
                    if(option >= 1){
                        int N = 1;
                        System.out.println("Existing number of copies: " + N);
                        int toAdd = N;
                        System.out.println("Enter new number of copies: ");
                        toAdd += Lib3Entry.getPosInt();

                        //update book count

                    }
                    break;
                case 0:
                    System.out.println("Going back");
                    return;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}
