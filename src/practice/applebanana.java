package practice;

import java.util.Scanner;

public class applebanana {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter first word: ");
        String first= scan.next();

        System.out.println("enter second word");
        String second= scan.next();

        System.out.println(first.substring(1)+ second.substring(1));

                scan.close();
        }
    }

