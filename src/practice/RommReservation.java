package practice;

import java.util.Scanner;


public class RommReservation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to reserve a room?");
        String ans = scan.next();

        String room = "";


        while (!(ans.equals("yes") || ans.equals("no"))) {
            System.out.println("invalid choice. please reenter if you would like a room.");
            ans = scan.next();
        }
        if (ans.equalsIgnoreCase("yes")) {

            System.out.println("which type of room?");
            room = scan.nextLine();
            scan.nextLine();

         while(!(room.equals("King Bed")||room.equals("Queen Bed")|| room.equals("Single Bed"))) {
                System.out.println("Invalid Room. Please select correct room.");
                room = scan.nextLine(); }

            if (room.equals("King Bed")) {
                System.out.println("King Bed= $120");
            } else if (room.equals("Queen Bed")) {
                System.out.println("Queen Bed= $100");
            } else {
                System.out.println("Single Bed=$80");
            }

            }
             else{
                System.out.println("Have a nice day!");
            }


    }
    }



