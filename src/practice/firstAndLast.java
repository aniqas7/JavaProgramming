package practice;

import java.util.Scanner;
public class firstAndLast {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String firstWord="";
        String secondWord="";

        System.out.println("enter first word: ");
        firstWord=input.next();

        System.out.println("enter second word: ");
        secondWord=input.next();

        System.out.println(firstWord.equals(secondWord));

input.close();





    }
}
