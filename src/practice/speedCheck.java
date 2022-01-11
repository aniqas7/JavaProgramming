package practice;

import java.util.Scanner;

public class speedCheck {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("speed is: ");
        int currentSpeed= input.nextInt();


        int speedlimit= 55;
        int speedDifference= currentSpeed-speedlimit;

        input.close();

        if (currentSpeed>speedlimit){
            System.out.println("slow down, you are driving " +speedDifference +" over the speed limit." );
        }
        else {
            System.out.println("");
        }

    }
}
