package day12_scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);

        System.out.println("enter your name");
        String name = input.next(); //use with one word input
        System.out.println("name ="+ name); //aniqa siddiqi doesnt read space

        input.close();
    }

}
