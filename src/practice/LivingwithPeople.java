package practice;

import java.util.Scanner;

public class LivingwithPeople {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter number of people");
        int numOfPeople = input.nextInt();

        if (numOfPeople < 3) {
            System.out.println("lives with less than 3 people");
        } else if (numOfPeople <= 6) {
            System.out.println("lives with 3-6 people");
        } else{
            System.out.println("lives with more than 6 people");
        }
    }
}
