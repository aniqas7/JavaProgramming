package day12_scanner;

import java.util.Scanner;
public class day12_Scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of circle");

        double r= input.nextDouble();

        double area= r*r*3.14;
        double perimeter= 2*r*3.14;

        System.out.println("area= "+ area);
        System.out.println("periemeter=  "+ perimeter);

        input.close();
    }
}
