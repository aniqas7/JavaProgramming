package practice;

import java.util.Scanner;

public class salarycalc {

    public static void main(String[] args){
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.println("How much you make an hour?");
            double hourlyrate = scan.nextDouble();

            System.out.println("How many hours do you work per week?");
            int weeklyhours = scan.nextInt();

            System.out.println("Enter your state tax rate");
            double taxrate = scan.nextDouble();

            double grosssalary = 52 * hourlyrate * weeklyhours;
            double federaltax = .26;
            double statetax = taxrate;
            double totaltax = federaltax + statetax;


            System.out.println("1. Gross Salary: " + grosssalary);
            System.out.println("2. Federal Tax: " + federaltax);
            System.out.println("3. State Tax: " + statetax);
            System.out.println("4. Total Tax: " + totaltax);
            System.out.println("5. Net Income: " + (grosssalary-(grosssalary * totaltax)));
            System.out.println();

            System.out.println("would you like to continue?");
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
            scan.close();
        }


        /*
        5. Write a program for the salary calculator
			1. Ask the user "How much you make an hour?"
					If user entered hourlyRate is 0 or negative, terminate the program after displaying the error message "Invalid Entry for Hourly Rate"

			2. Ask the user  "How many hours do you work per week?"
					if user entered weeklyHour is less than 1 or greater than 144, terminate the program after displaying the error message "Invalid Entry for Weekly Hours"

			3. Ask the user  "Enter your state tax rate"
					if the state tax rate is less than 0% or greater than 10%, terminate the program after displaying the error message "Invalid Entry for state tax Rate"


			4. Display:
					1. Gross Salary
					2. Federal Tax (assume that federal tax rate is 26%)
					3. State Tax
					4. Total Tax
					5. Net Income

			5. Ask the user "Would you like to continue?"
				If "yes" --> repeat all the previous steps
				If "no" --> print "Thank you for using Cydeo Salary Calculator APP"

				If user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"

         */

    }
}
