package day17_whileLoops;

import java.util.Locale;
import java.util.Scanner;

public class eligibletovote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = scan.nextInt(); //valid age: 1-120


        while (!(age >= 1 && age <= 120)) {
            System.err.println("invalid entry, please re-enter");
            System.err.println("enter your age:");
            age = scan.nextInt();
        }
        System.out.println("enter if you are US citizen: yes/no");
        String answer = scan.next().toLowerCase();

        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("invalid entry, please re-enter");
            System.err.println("Are you a US citizen? yes/no");
            answer = scan.next().toLowerCase();
        }

        if (age > 18 && answer.equals("yes")) {
            System.out.println("you are eligible to vote");

        }
    else{
            System.out.println("not eligible to vote");
        }
    }
}
