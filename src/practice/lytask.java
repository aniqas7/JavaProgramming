package practice;

import java.util.Scanner;

public class lytask {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter word");
        String word= scan.next();
scan.close();

        if(word.endsWith("ly")) {
            System.out.println("really???");
        }
            else {
                System.out.println("never mind");
            }

        }

    }

