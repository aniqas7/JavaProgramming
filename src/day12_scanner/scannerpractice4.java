package day12_scanner;

import java.util.Scanner;
public class scannerpractice4 {

    public static void main(String[] args) {


        //123Enter
        Scanner input= new Scanner (System.in);

        System.out.println("enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter programming language");
        String programminglanguage= input.nextLine();


        System.out.println("enter your age: ");
        int age= input.nextInt(); //24

        input.nextLine();

        System.out.println("enter your school name");
        String schoolName= input.nextLine();


        System.out.println("full name= "+ fullName);
        System.out.println("programming language= "+programminglanguage);
        System.out.println("age= "+ age);
        System.out.println("school name= "+ schoolName);



        input.close();
    }
}
