package practice;

import java.util.Locale;
import java.util.Scanner;

public class Travel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int baseCost = 1000;
        int cost = 0;

        System.out.println("do you have a valid passport? yes or no");
        String validPassport = scan.next().toLowerCase();
        scan.nextLine();


        if (validPassport.equals("yes")) {
            System.out.println(baseCost);
            scan.nextLine();

            System.out.println("country traveling to: ");
            String country = scan.nextLine();

            System.out.println("how many bags?: ");
            byte bags = scan.nextByte();
            cost = (bags *= 50) + baseCost;

            System.out.println("how many people traveling with?: ");
            short people = scan.nextShort();


            if (people == 1) {
                cost = cost -= 100;
            } else if (people == 2) {
                cost = cost -= 200;
            } else if (people >= 3) {
                cost = cost -= 300;
            }
            else {
                System.out.println("");
            }

            scan.nextLine();
            System.out.print("names of the people traveling with: ");
            String names = scan.nextLine();



            System.out.println("your ticket is booked to " + country + ". We have charged extra for the " +
                    bags + ", but you are traveling with " + people + " so we are giving a discount. " +
                    "Your total cost is " + cost);
        }
        else {
            cost=200;
            System.out.println("when did you passport expire?");
            int expiredyear= scan.nextInt();
            cost+= 75*(2021-expiredyear);
            scan.nextLine();

            System.out.println("which country traveling to?");
            String country= scan.nextLine();

            System.out.println("will you be traveling this year?");
            String yesOrNo= scan.next().toLowerCase();


            if(yesOrNo.equals("yes")){
                cost+=100;
            }
            else{
                cost-=50;
            }


            System.out.println("looks like your password has been expired for "
            + (2021-expiredyear)+ " years, but don't worry we will get it ready for you to travel to "+
            country+ ".Your total cost is "+ cost);


            scan.close();
        }


    }
}
