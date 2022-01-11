package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;
import java.util.Scanner;

public class replitstring {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        String firstname;
        String lastname;
        String domain;



        firstname=email.substring(0,email.indexOf("_"));
        lastname=email.substring(email.indexOf("_")+1,email.indexOf("@"));
        domain=email.substring(email.indexOf("@")+1,email.indexOf("."));

        firstname=firstname.substring(0,1).toUpperCase()+firstname.substring(1);
        lastname=lastname.substring(0,1).toUpperCase()+lastname.substring(1);
        System.out.println("First name: "+firstname);
        System.out.println("Last name: "+lastname);
        System.out.println("Domain: "+domain);


    }

}
  

