package com.knoldus.kup.advance.java.Question1;
import java.util.ArrayList;
import java.util.Scanner;
public class Restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ArrayList<Dish> dishes = Menu.menuList; //Getting the menuList variable of Menu class

        do {
            System.out.println("===================== Restaurant =====================" );
            System.out.println("Press 1 : Display Dishes");
            System.out.println("Press 2 : Search Dish");
            System.out.println("Press 0 : Exit");

            choice = scanner.nextInt();
            if (choice == 1) {
                dishes.forEach((Dish dish)->System.out.println(dish));
            }else if(choice == 2){
                int id = scanner.nextInt();
                if(id < 1 || id > dishes.size()){
                    System.out.println("Dish is not available");
                }else {
                    for (int i=0; i<dishes.size();i++){
                        if (dishes.get(i).dishID == id){
                            System.out.println("Dish found successfully...");
                            System.out.println(dishes.get(i));
                        }
                    }
                }
            }
        }while (choice != 0);
    }
}
