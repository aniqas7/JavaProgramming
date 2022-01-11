package day19_nestedloop;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1= scan.nextInt();

        System.out.println("Enter a math operator:");
        char operator= scan.next().charAt(0);//"+".charAt(0)

        if(!(operator=='+'||operator=='-')){
            System.err.println("invalid math operator" + operator);
            System.exit(0);
        }

        System.out.println("Enter a number:");
        int num2= scan.nextInt();

        if (operator=='+'){
            System.out.println(num1-num2);
        }
        else{
            System.out.println(num1+num2);
        }

    }
}
