package practice;

import java.util.Scanner;

public class circleexercise {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);

        System.out.println("Enter radius of the circle: ");
        double radius= input.nextDouble();


        System.out.println("radius= " + radius);

        System.out.println("area= "+ (3.14*radius*radius) );
        System.out.println("perimeter= "+ (2*3.14*radius));


    input.close();

    }
}
