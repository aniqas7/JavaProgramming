package practice;

import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter a string");
        String str= scan.nextLine();

        String reverse= "";

        for (int i =str.length()-1; i >= 0; i--) {

            char ch = str.charAt(i);

            reverse += ch;

            //hello
        }
            System.out.println(reverse);







    }
}
