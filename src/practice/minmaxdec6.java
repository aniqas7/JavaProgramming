package practice;

import java.util.Arrays;
import java.util.Scanner;

public class minmaxdec6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int number []= new int[10];

        for (int i = 0; i < 10 ; i++) {
            System.out.println("enter 10 numbers");
            number[i] = scan.nextInt();
        }
            Arrays.sort(number);
        System.out.println("min="+number[0]);
        System.out.println("max="+number[9]);
scan.next();

        }


    }
