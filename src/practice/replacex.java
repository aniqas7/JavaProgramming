package practice;

import java.util.Scanner;

public class replacex {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter a word:");
        String word= scan.next();

        if (word.charAt(0)=='x') {
            System.out.println(word.substring(1));
        }
        else {
            System.out.println("");
        }

        /*

        if(word.substring(0, 1).equals("x")){
            System.out.println(word.substring(1));
        }
        else {
            System.out.println("");
        }


         */


        scan.close();
    }
}
