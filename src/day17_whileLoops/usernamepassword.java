package day17_whileLoops;

import java.util.Scanner;

public class usernamepassword {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter username:");
        String u=scan.next();


        System.out.println("enter password:");
        String p= scan.next();

        if(u.equals("Cydeo")&& p.equals("Cydeo123")){
            System.out.println("logged in");
        } else {
            int attempts=3;
           while(!(u.equals("Cydeo")&& p.equals("Cydeo123"))&& attempts>0){
               if(attempts==1){
                   System.out.println("this is your last attempt");
               }
               System.out.println("invalid username or password");
               System.out.println("re-enter username");
               u=scan.next();

               System.out.println("re-enter password");
               p=scan.next();
               attempts--;

           }
           if(u.equals("Cydeo")&& p.equals("Cydeo123")){
               System.out.println("logged in");
           }else{
               System.out.println("locked");
           } scan.close();
        }
    }
}
