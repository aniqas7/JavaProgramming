package day18_nestedloop;

import java.util.Scanner;

public class additionoftwonum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    while(true) {
        System.out.println("enter first number: ");
        int num1 = scan.nextInt();
        System.out.println("enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("addition=" + (num1
                + num2));

        System.out.println("would you like to cont");
        String a = scan.next().toLowerCase();

        while (!(a.equals("yes")||a.equals("no"))){
            System.err.println("invalid, would you like to cont");
           a = scan.next().toLowerCase();
        }
        if (a.equals("no")) {
            break;
        }
scan.close();
    }
    }
}
