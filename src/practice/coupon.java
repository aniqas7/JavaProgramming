package practice;

import java.util.Scanner;

public class coupon {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupon = s.nextInt();

        //25
        int candybar =0;
        int gumball = 0;

            if (coupon >= 3) {
                candybar = (coupon / 10); // i can buy 2 cb
                coupon = coupon % 10; // coupon value now 5

                gumball = coupon / 3; //5/3=1.
                coupon = coupon % 3; //5%3=2

                System.out.println("Number of Candies: " + candybar + "\nNumber of Gumballs: " + gumball);
            } else{
                System.out.println("Not enough coupons");

            }
            s.close();
        }


    }

