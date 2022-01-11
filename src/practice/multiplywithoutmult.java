package practice;

import java.util.Scanner;

public class multiplywithoutmult {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);

        System.out.println("enter first number");
        int num1= scan.nextInt();
        System.out.println("enter second number");
        int num2= scan.nextInt();

        int number= 0;

        for (int i = 0; i < num2; i++) {


            //3*4=3+3+3+3
            number+=num1;

        }

        System.out.println(number);
    }
}
