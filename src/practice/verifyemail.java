package practice;

import java.util.Scanner;

public class verifyemail {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("enter a valid email:");
        String gmail= scan.next();

        if(gmail.endsWith("gmail.com")){
            System.out.println("valid email");
        }
        else{
            System.out.println("invalid");
        }

        scan.close();


    }
}
