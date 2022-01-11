package practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter string: ");
        String str= scan.next();

        String word="";
        String trueorfalse="";

        for (int i = str.length()-1; i >=0; i--) {

            char ch = str.charAt(i);

            word += ch;
        }

           boolean isPalindrome= (word.equals(str));

            System.out.println(isPalindrome);



        }



    }
