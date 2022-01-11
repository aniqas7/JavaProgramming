package practice;

import java.util.Scanner;

public class CheckWords {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        System.out.println("please enter first word");
        String firstword= scan.next();

        System.out.println("please enter second word");
        String secondword= scan.next();

        System.out.println("please enter third word");
        String thirdword= scan.next();

        if (firstword.length()==secondword.length() && secondword.length()==thirdword.length()){
            System.out.println("all words are same length");
        }
        else if (firstword.length()==secondword.length() || secondword.length()==thirdword.length() ||
        firstword.length()==thirdword.length()){
            System.out.println("some words are same length");
        }
        else{
            System.out.println("all words are different length");
        }

        scan.close();

    }
}
