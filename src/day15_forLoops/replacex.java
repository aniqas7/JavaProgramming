package day15_forLoops;

import java.util.Scanner;

public class replacex {  //xcodeX
    public static void main(String[] args) {
       String word= new Scanner(System.in).next();

        word= word.replace("x","a").replace("X","a");
        System.out.println(word);     //acodeX                 acodea

    }
}
