package com.knoldus.kup.advance.java.Question15;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class GetLastModifiedTime {
    public static void main(String... args){
        File file = new File("src/com/knoldus/kup/advance/java/Question15/Test.txt");
        long time = file.lastModified();
        DateFormat sdf
                = new SimpleDateFormat("MMMM dd, yyyy hh:mm a");
        System.out.println("modified date is : "
                + sdf.format(time));
    }

}
