package practice;

import java.util.Scanner;

public class areapermofcircle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("enter radius of a circle:");
            double radius = scan.nextDouble();
            if (radius <= 0) {
                System.exit(0);
            }
            System.out.println("diameter: " + 2 * radius);
            System.out.println("area: " + 2 * radius * radius);
            System.out.println("perimeter: " + 2 * 3.14 * radius);

            System.out.println("would you like to calculate another circle?");
            String ans = scan.next();

            while (!(ans.equals("yes") || ans.equals("no"))) {
                System.out.println("invalid answer, please reenter:");
                System.out.println("would you like to calculate another circle?");
                ans = scan.next();
            }


            if (ans.equals("no")) {
                System.out.println("thank you for using calculator");
                break;
            }
        }
    }
}

