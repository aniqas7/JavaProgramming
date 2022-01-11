package day15_forLoops;

import java.util.Scanner;

public class minNum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int min=2147483647; // any num user enters will be less than this number

        for (int i = 10; i < 15; i++) {
            System.out.println("enter a number");
            int num= scan.nextInt(); // 67,23,42,5,-10

            if (num<min);
            min=num;

            scan.close();

            System.out.println(min);


        }
    }
}
