package practice;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("enter username");
        String username= scan.next();

        System.out.println("enter password");
        String password= scan.next();

        if(username.equals("Cydeo") && password.equals("WoodenSpoon") ){
            System.out.println("Logged in");
        }
        else{
            System.err.println("incorrect username or password");

            scan.close();
        }
    }
}
