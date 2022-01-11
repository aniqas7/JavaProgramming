package day15_forLoops;

import java.util.Scanner;

public class anyWord {
    public static void main(String[] args) {

        String word= new Scanner (System.in).next(); //one ui

        if (word.charAt(0) == 'x') {
            word= word.replaceFirst("x","a");

        }
        System.out.println(word);
    }
}
