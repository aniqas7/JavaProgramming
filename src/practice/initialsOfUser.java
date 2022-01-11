package practice;

import java.util.Scanner;

public class initialsOfUser {
    public static void main(String[] args) {
   String firstname = "";
   String secondname="";

        Scanner input= new Scanner(System.in);
        System.out.println("first name");
        firstname=input.next();

        System.out.println("second name");
        secondname= input.next();

        char first= firstname.charAt(0);
        char second= secondname.charAt(0);

        System.out.println(first + "." + second);

input.close();
    }
}
