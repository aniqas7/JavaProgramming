package practice;

import java.util.Scanner;

public class enter5times {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        int pos=0;
        int neg=0;

        for (int i = 0; i < 5; i++) {

            System.out.println("enter number 5 times: ");
            int num= scan.nextInt();


            if(num>0) {
                pos += 1;
            }
            else if(num<0) {
                neg += 1;
            }
        }

        System.out.println (pos+" positive and "+ neg+ " negative");



    }
}
