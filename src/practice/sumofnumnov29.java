package practice;

import java.util.Scanner;

public class sumofnumnov29 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int num=scan.nextInt();
        int num2=scan.nextInt();

        while(num>=0){
            System.out.println(num+num2);

            System.out.println("enter new num:");
            num=scan.nextInt();
            System.out.println("enter new num2:");
            num2=scan.nextInt();
        }
    }
}
