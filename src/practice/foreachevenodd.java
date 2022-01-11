package practice;

import java.util.Arrays;

public class foreachevenodd {
    public static void main(String[] args) {

        /*
         Write a program that can count the even and odd number from an array of integers

			Note: MUST use for each loop

         */

        int[] arrays={1,2,3,4,5};
        int counteven=0;
        int countdodd=0;

        for (int each : arrays) {
            if(each%2==0){
                counteven++;
            }
            if(each%2==1){
                countdodd++;
            }
        }
        System.out.println("counteven="+counteven);
        System.out.println("countodd="+countdodd);

    }
}
