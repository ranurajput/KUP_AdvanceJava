package com.knoldus.kup.advance.java.Question8;


public class TryCatch {
    public static void main(String... args){
        int a = 50, b = 0;
        System.out.println("Handle the exception using try and multiple catch blocks");
        try {
            System.out.println("RanuRajput".charAt(20));
            System.out.println(a / b);
        }
        catch (NullPointerException npe){
            System.out.println("NullPointerException ");
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception");
        }
        catch (StringIndexOutOfBoundsException stre){
            System.out.println("StringIndexOutOfBoundsException");
        }

        catch (Exception e){
            System.out.println("Exception caught");
            System.out.println(e);
        }

    }
}
