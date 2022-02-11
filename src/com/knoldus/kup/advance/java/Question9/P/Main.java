package com.knoldus.kup.advance.java.Question9.P;
import com.knoldus.kup.advance.java.Question9.P1.TwoDim;
import com.knoldus.kup.advance.java.Question9.P2.ThreeDim;
public class Main {
    public static void main(String[] args) {
        TwoDim reference;           // obtain a reference of type TwoDim
        reference = new TwoDim(1,5);   // object of type TwoDim
        System.out.println(reference);

        // // object of type ThreeDim
        reference =new ThreeDim(2,4,6);
        System.out.println(reference.toString());
    }
}
//X = 1, Y = 5
//X = 2, Y = 4, Z = 6