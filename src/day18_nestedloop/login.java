package day18_nestedloop;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your username:");
        String u = scan.next();

        System.out.println("enter your passwowrd: ");
        String p = scan.next();

        if (u.equals("Cydeo") && p.equals("WoodenSpoon")){
            System.out.println("Logged In");
        }
        else {
            for (int i = 0; i < 3; i++) {
                System.out.println("incorrect username or password");
                System.out.println("enter your username");
                u = scan.next();
                System.out.println("enter your passwowrd: ");
                p = scan.next();

                if(u.equals("Cydeo") && p.equals("WoodenSpoon")){
                    System.out.println("Logged In");
                }

                }
            if (!(u.equals("Cydeo") && p.equals("WoodenSpoon"))){
                System.out.println("Locked");

                scan.close();

            }

        }
    }
}
