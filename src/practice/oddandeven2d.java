package practice;

import java.util.Arrays;

public class oddandeven2d {
    public static void main(String[] args) {
        /*
        2. Write a program that can count the total odd
         and even numbers from a two dimensional array
         */

        int[][] numbers = {{7, 8, 9}, {10, 11, 12}};
        int counteven = 0;
        int countodd = 0;

        for (int[] each : numbers) {
            for (int j : each) {
                if (j % 2 == 0) {
                    counteven++;
                }
                if (j % 2 == 1) {
                    countodd++;

                }

            }
        }System.out.println(counteven);
        System.out.println(countodd);

    }
}

