package practice;

import javax.swing.*;
import java.util.Scanner;

public class one_eight {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        System.out.println("enter first word");
        String word= scan.next();

        System.out.println("enter second word");
        String word2= scan.next();

        //if mat= tae print t, or add them together

        if(word.charAt(word.length()-1)==word2.charAt(0)) {
            System.out.println(word2.charAt(0));
        }
        else{
            System.out.println(word+word2);


        }
    }
}
