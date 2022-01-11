package practice;

import java.util.Scanner;

public class printchar {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("enter first word: ");
        String firstword= scan.next();

        System.out.println("enter second word: ");
        String secondword= scan.next();

        System.out.println(firstword.substring(1)+ secondword.substring(1));


        scan.close();
    }
}
