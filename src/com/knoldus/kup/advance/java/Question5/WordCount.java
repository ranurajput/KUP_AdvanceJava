package com.knoldus.kup.advance.java.Question5;
import java.io.BufferedReader;
import java.io.FileReader;
public class WordCount {
    public static void main(String... args) throws Exception{
        String Line;
        int wordCount = 0;
        int LineCount = 0;
        int CharacterCount = 0;
        FileReader fr = new FileReader("src/com/knoldus/kup/advance/java/Question5/Lear.txt");
        BufferedReader br = new BufferedReader(fr);
        while ((Line = br.readLine()) != null){
            LineCount++;
            String words[] = Line.split(" ");
            CharacterCount += Line.length();
            wordCount += words.length;
        }
        System.out.println("Words: "+wordCount+"\nLines: "+LineCount+"\nCharacters: "+CharacterCount);
    }
}
