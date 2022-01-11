package practice;

import java.util.Scanner;

public class PlaceAnOrder {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter the product name: ");
        String name= input.nextLine();

        System.out.println("enter the price: ");
        double price= input.nextDouble();

        System.out.println("enter the quantity");
        int quantity= input.nextInt();

        System.out.println("enter first name: ");
        String firstName= input.next();

        System.out.println(firstName+","+ " your order for "+ quantity
        + " "+ name+ " "+ "has been placed. your total is "+ price);



        }

    }

