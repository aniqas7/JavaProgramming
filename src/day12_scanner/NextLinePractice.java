package day12_scanner;


import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

      Scanner input= new Scanner(System.in);

        System.out.println("Enter your age");
        int age= input.nextInt();

        input.nextLine(); //clears scanners memory out

        System.out.println("Enter your full name");
        String fullName= input.nextLine();

        System.out.println("enter GPA");
        double GPA= input.nextDouble();

        input.nextLine();


        System.out.println("enter school name");
        String schoolname= input.nextLine();

        System.out.println("age= "+ age);
        System.out.println("full name "+fullName );
        /*
        ask user to enter age (nextInt())
        ask user to enter full name (nextLine())
         */
    }
}
