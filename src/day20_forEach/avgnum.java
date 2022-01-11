package day20_forEach;

import java.util.Arrays;
//numbers.for is short cut
public class avgnum {
    public static void main(String[] args) {

        int[] numbers= {10,20,30,40,50,60};
        double sum=0;

        for (int each : numbers) {
            sum += each;
        }
           double avg= sum/numbers.length;

        System.out.println(avg);
        }


    }

