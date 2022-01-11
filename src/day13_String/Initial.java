package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        // firstName="Wooden"
        // lastName="Spoon"
        //output: W.S

        Scanner input= new Scanner(System.in);

        System.out.println("Enter first name");
        String firstName= input.next();

        System.out.println("Enter last name");
        String lastName= input.next();

        char A = firstName.charAt(0);
        char S= lastName.charAt(0);

        String initial= A + "."+ S;
        System.out.println("initial = " + initial);

    input.close();

    }
}
