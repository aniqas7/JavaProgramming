package practice;

import java.util.Scanner;

public class areaandperimofsquare {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);


        while(true) {
            System.out.println("enter side of square: ");
            double s = scan.nextDouble();

            if (s <= 0) {
                System.out.println("invalid input");
                System.exit(0);
            }
            System.out.println("area=" + s * s);
            System.out.println("perimeter=" + (2 *(s+s)));

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

        /*
        2. Write a program that can calculate the area and perimeter of a Square:
			1. Ask the user "Enter the side of the square:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

			2. Display:
					1. Area of square
					2. Perimeter of square

			3. Ask the user "Would you like to calculate another Square?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
         */

    }

