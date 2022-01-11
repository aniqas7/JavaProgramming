package practice;

import java.util.Locale;
import java.util.Scanner;

public class dinnernov29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        int count = 0 ;
        int number=0;

        //5*2= 5+5
/*
        for (int i = 1; i < num2; i++) {

            num1+=num1;

        }
        System.out.println(num1);

 */

        //15/5=3

        int frequency=0;

        while(num1>=num2){
            num1-=num2;
            frequency++;
        }

        System.out.println(frequency);
       }

    }

