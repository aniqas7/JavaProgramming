package practice;

import java.util.Locale;
import java.util.Scanner;

public class tipCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("split or no split? yes/no");
        String split = scan.next().toLowerCase();

        System.out.println("number of people: ");
        int people = scan.nextInt();

        System.out.println("check amount: ");
        double amount = scan.nextDouble();

        System.out.println("how was service quality: (excellent/great/good/fair/poor");
        String quality = scan.next().toLowerCase();

        double split1= amount/people;
        double tip;



        if (quality.equals("excellent")) {
            tip=.25;
        }
        else if (quality.equals("great") ){
            tip=.20;
        }
        else if (quality.equals("good")) {
            tip=.15;
        }
        else if (quality.equals("fair")) {
            tip=.10;
        }
        else  {
            tip=.05;
        }

        System.out.println("total to pay: "+ amount);
        double actualtip= tip*amount;

        System.out.println("total tip: "+ actualtip);

        if(split.equals("yes")){
            System.out.println("total per person: "+ split1);
            System.out.println("total tip per person: "+ actualtip/people);


        }

    }
}
