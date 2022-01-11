package day18_nestedloop;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }
            System.out.println("would you like to enter another number?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
            System.err.println("invalid answer. would you like to enter another number?");
            a = scan.next().toLowerCase();
        }
            if (a.equals("no")) {
                break;
            }

        }
        scan.close();
    }
}