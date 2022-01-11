package day20_arrays;

import java.util.Scanner;

public class minandmax {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        int numbers []=new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number:"); //loop to ask and enter number 10 times
           numbers[i]= scan.nextInt();
        }
        int max= numbers[0];
        int min= numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
            if(numbers[i]<min){
                min=numbers[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
