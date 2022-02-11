package com.knoldus.kup.advance.java.Question2;
import java.util.HashMap;
import java.util.Scanner;
public class PhoneBook {
    public static void main(String[] args) {
//       Create an empty hash map by declaring object of string type
        HashMap<String, String> phoneBook = new HashMap<String, String>();
//        Getting choice from user
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("==================== Phone Book ====================");
            System.out.println("Press 1 : Add new phone book entry");
            System.out.println("Press 2 : Search a Phone Number");
            System.out.println("Press 3 : Exit");
            choice = scanner.nextInt();
            if (choice == 1){
                System.out.println("Enter contact name");
                String name = scanner.next();
                System.out.println("Enter contact number");
                String phone = scanner.next();
                phoneBook.put(name, phone);
            }else if (choice == 2){
                System.out.println("Enter name to find contact");
                String name = scanner.next();

                if(phoneBook.containsKey(name)){
                    String phone =phoneBook.get(name);
                    System.out.println("Contact Name: "+name+"" +
                            "\nContact Number: "+phoneBook.get(name));
                }
            }
        }while (choice != 3);
    }
}