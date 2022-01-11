package practice;

import java.util.Scanner;

public class firstcharacterisdigit {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter a word");
        String word= scan.next();

        int num=0;
        boolean number= 48 < num && num>52;
        boolean number2= 65 < num && num>90;
        boolean number3= 141 < num && num>172;


        if(word.charAt(0)>=48 && word.charAt(0)<=52) {
            System.out.println("first character is a digit");
        }
        else if(word.charAt(0)>=65 && word.charAt(0)<=90) {
            System.out.println("first character is uppercase");
        }
        else if (word.charAt(0)>=141 && word.charAt(0)<=172) {
            System.out.println("first character is lowercase");
        }
        else{
            System.out.println("first character is special character");
        }
        scan.close();
    }
}
