package day12_scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        System.out.println("enter full name");
        String fullName= input.nextLine();

        System.out.println("enter building number");
        int buildingnum= input.nextInt();
        input.nextLine();

        System.out.println("enter street name");
        String streetname= input.nextLine();

        System.out.println("enter city name");
        String cityname= input.nextLine();

        System.out.println("enter state name");
        String statename= input.next();

        System.out.println("enter zip code");
        int zipcode= input.nextInt();

        System.out.println(fullName+ "\n"+ buildingnum +" " + streetname
        + "\n"+ cityname+ " "+ statename+ "\n"+ zipcode);

        input.close();


        /*
        enter full name (nextLine
        enter building number (next
        enter street name (next Line
        enter city name (next Line
        enter state like VA (next
        enter zip code (next
        display zip code
         */
    }
}
