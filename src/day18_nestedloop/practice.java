package day18_nestedloop;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


//we use while loop bc we want to keep asking to reenter age till valid
        while (true) {
            System.out.println("enter age");
            int age = scan.nextInt();

            while (!(age >= 0 && age <= 120)) { //while age is wrong, keep asking to reenter
                System.out.println("invalid, please reenter age");
                age = scan.nextInt();
            }
            System.out.println("would you like to continue?");
            String a= scan.next();

            while(!(a.equals("no")||a.equals("yes"))){
                System.out.println("invalid answer, please reenter")
                ;
                System.out.println("would you like to continue?");
                a= scan.next();
            }
            if(a.equals("no")){
               break;
            }
            scan.close();
        }
    }
}
