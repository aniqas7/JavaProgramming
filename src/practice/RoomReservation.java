package practice;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
        while (true) {
            int price = 0;
            Scanner scan = new Scanner(System.in);
            System.out.println("which bedroom do you want to reserve?");
            String bedroom = scan.nextLine();
            scan.nextLine();

            while (!(bedroom.equals("King Bed") || bedroom.equals("Queen Bed") || bedroom.equals("Single Bed"))) {
                System.out.println("invalid, please reenter bedroom");
                bedroom = scan.nextLine();
            }

            if (bedroom.equals("King Bed")) {
                price += 120;
            } else if (bedroom.equals("Queen Bed")) {
                price += 100;
            } else {
                price += 80;
            }

            System.out.println("how many nights?");
            int nights = scan.nextInt();

            while (nights < 1) {
                System.out.println("invalid, please reenter nights");
                nights = scan.nextInt();
            }

            System.out.println("would you like to reserve another room?");
            String yesno = scan.next();

            while (!(yesno.equals("yes") || yesno.equals("no"))) {
                System.out.println("invalid, please reeenter");
                yesno = scan.next();
            }
            if (yesno.equals("yes")) {
                price += price;
            }

                if (yesno.equals("no")) {

                    System.out.println("total price: " + price * nights);
                    break;
                }
            }
        }

}




