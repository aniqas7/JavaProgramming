package practice;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("enter first word: ");
        String firstword= scan.next();

        char firstcharacter= firstword.charAt(0);

        if(firstcharacter>=47 && firstcharacter<=57){
            System.out.println("first character is a digit");
        }
        else if(firstcharacter>=65 && firstcharacter<=92) {
            System.out.println("first character is upper case letter");
        }
        else if (firstcharacter>=97 && firstcharacter<=122){
            System.out.println("first character is lower case letter:");
        }
        else{
            System.out.println("special character");
        }
scan.close();


    }
}
