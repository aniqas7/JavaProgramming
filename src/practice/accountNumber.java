package practice;

import java.util.Scanner;

public class accountNumber {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("enter an account number: ");
        String number= scan.next();

        char startswith= number.charAt(0);

        if(startswith=='2' && number.length()==7){
            System.out.println("valid number");
        }
        else if(startswith=='5'&& number.length()==10){
            System.out.println("valid number");
        }
        else {
            System.out.println("invalid");
        }
        scan.close();

    }
}
