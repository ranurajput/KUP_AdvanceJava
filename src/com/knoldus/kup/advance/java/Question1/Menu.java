package com.knoldus.kup.advance.java.Question1;
import java.time.LocalTime;
import java.util.ArrayList;
public class Menu {
    static ArrayList<Dish> menuList;  //declaring an arraylist of menuList as class variable
    //Using static block
    static {
    //Adding some dishes by using Dish class
        Dish Razma_Chawal= new Dish(1, "Razma Chawal", LocalTime.now());
        Dish Aaloo_Parantha= new Dish(2, "Aaloo Parantha", LocalTime.now());
        Dish Gobhi_Poori_Rayta= new Dish(3, "Gobhi Poori Rayta", LocalTime.now());
        Dish matar_paneer= new Dish(4, "Matar Paneer", LocalTime.now());
        Dish dal_makhni= new Dish(5, "Dal Makhni", LocalTime.now());
        Dish IceCream= new Dish(5, "IceCream", LocalTime.now());
        //Adding all created dishes to arraylist
        menuList = new ArrayList<Dish>();
        menuList.add(Razma_Chawal);
        menuList.add(Aaloo_Parantha);
        menuList.add(Gobhi_Poori_Rayta);
        menuList.add(matar_paneer);
        menuList.add(dal_makhni);
        menuList.add(IceCream);
    }
}
