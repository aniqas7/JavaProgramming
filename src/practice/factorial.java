package practice;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        System.out.println("enter a number: ");
        int number= scan.nextInt();

        int prod= 1;

        for (int i = 1; i <=number; i++) {

            prod*=i;


            scan.close();
        }

        System.out.println(prod);

          /*
            1x1=1
            1*2=2
            2*3=6
            6x4=24
            24*5=120
             */
    }
}
