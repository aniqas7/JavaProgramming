package day19_nestedloop;

import java.util.Scanner;

public class oddoreven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter a number");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("even num");
            } else {
                System.out.println("odd num");
            }
            System.out.println("would you like to enter another num?");
            String a = scan.next();

            if (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))){
                System.exit(0);
        }
            if(a.equalsIgnoreCase("no"))
            break;

        }
    }
}
