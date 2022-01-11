package practice;

import java.util.Scanner;

public class Integers {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scan.nextLine();

        System.out.println("Enter your gender:");
        String gender = scan.next().toLowerCase();

        while( !(gender.equals("male")||gender.equals("female")) ){
            System.err.println("Invalid Entry, please re-enter your gender:");
            gender = scan.next().toLowerCase();
        }

        System.out.println("Are you married?");
        String married = scan.next().toLowerCase();

        while( !(married.equals("yes")||married.equals("no")) ){
            System.err.println("Invalid Entry, please re-enter! Are you married?");
            married = scan.next().toLowerCase();
        }

        System.out.println("Enter your age:");
        int age = scan.nextInt();

        while (age > 120 || age <0){
            System.err.println("Invalid Entry, please re-enter your age:");
            age = scan.nextInt();
        }

        System.out.println("How many miles do you drive in a day?");
        int miles = scan.nextInt();

        while(miles < 5){
            System.err.println("Invalid Entry, please re-enter mileage:");
            miles = scan.nextInt();
        }

        scan.nextLine();

        System.out.println("Would you like to have full coverage or liability insurance? (full coverage/liability)");
        String insuranceType = scan.nextLine().toLowerCase();

        while( !(insuranceType.equals("full coverage")||insuranceType.equals("liability"))){
            System.err.println("Invalid Entry, please re-enter! full coverage or liability?");
            insuranceType = scan.nextLine().toLowerCase();
        }

        System.out.println("Have you had any accidents or claims in past 5 years? (yes/no)");
        String hadAccidentOrClaims = scan.next().toLowerCase();

        while( !(hadAccidentOrClaims.equals("yes")||hadAccidentOrClaims.equals("no")) ){
            System.err.println("Invalid Entry, please re-enter! Have you had any accidents or claims in past 5 years?");
            hadAccidentOrClaims = scan.next().toLowerCase();
        }

        System.out.println("Does your car have an anti-theft device?");
        String hasAntiTheftDevice = scan.next().toLowerCase();

        while( !(hasAntiTheftDevice.equals("yes")||hasAntiTheftDevice.equals("no")) ){
            System.err.println("Invalid Entry, please re-enter! Does your car have an anti-theft device?");
            hasAntiTheftDevice = scan.next().toLowerCase();
        }

        double price = 0;

        // price calculation
        if(insuranceType.equals("liability")){
            if(age < 25){
                price += 90;
            }else{
                price += 50;
            }

            if(miles > 50){
                price += 50;
            }else if(miles > 10){
                price += 30;
            }else{
                price += 10;
            }

        }else{

            if(age < 25){
                price += 160;
            }else{
                price += 120;
            }

            if(miles > 50){
                price += 70;
            }else if(miles > 10){
                price += 40;
            }else{
                price += 20;
            }

        }


        double discountRate = 0;

        //discountRate calculation:

        if(hasAntiTheftDevice.equals("yes")){
            discountRate += 0.05;
        }

        if(hadAccidentOrClaims.equals("yes")){
            discountRate -= 0.15;
        }else{
            discountRate += 0.1;
        }

        if(married.equals("yes")){
            discountRate += 0.05;
        }

        double totalPrice = price * ( 1 - discountRate);

        scan.close();

    }


}



        /*
        int age =30;
        int temperature= 60;
        System.out.println(age);
        System.out.println(temperature);

        int years= 40;
        int herYears= years;
        System.out.println(herYears);
    }
}

         */
