package practice;

import java.util.Scanner;

public class emailtask1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("enter emaiil: ");
        String email= scan.nextLine();

        String firstName= email.substring(0,email.indexOf("_"));
        String lastName= email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String rest= email.substring(email.indexOf("@"));

        email= lastName+"_"+firstName+rest;

        if(email.contains("_")){
            System.out.println(lastName+"_"+firstName+rest);
        }
        else{
            System.out.println(firstName+lastName);
        }
        System.out.println(email);
    }
}
