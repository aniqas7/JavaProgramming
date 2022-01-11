package practice;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class emailtask2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("print email address:");
        String email= scan.next();

        String firstname= email.substring(0, email.indexOf("_"));
        String firstnameUC= firstname.substring(0,1).toUpperCase()+ email.substring(1, email.indexOf("_"));


        String lastname= email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String lastnameUC= lastname.substring(0,1).toUpperCase() + email.substring(email.indexOf("_")+2,email.indexOf("@"));

        String domain= email.substring(email.indexOf("@"));

        System.out.println(firstnameUC);
        System.out.println(lastnameUC);
        System.out.println(domain);
        scan.close();

    }
}
