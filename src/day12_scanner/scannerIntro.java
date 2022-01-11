package day12_scanner;

import java.util.Scanner;

public class scannerIntro {
    public static void main(String[] args) {

    Scanner input= new Scanner(System.in);

    //input.nextInt(200);

        System.out.println("enter an integer: ");
    int num1= input.nextInt();
        System.out.println("enter a decimal");

        double num2= input.nextDouble();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println("Multiplication: "+ num1*num2);


        input.close();
    }
}

