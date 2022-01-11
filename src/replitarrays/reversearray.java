package replitarrays;

import java.util.Arrays;
import java.util.Scanner;

public class reversearray {

    // Write your code here

    public static int findMax(int[] array) {
        Arrays.sort(array);
       // int result = array[array.length - 1];
        return array.length - 1;
    }

    public static double findMax(double[] array) {
        Arrays.sort(array);
       // double result = array[array.length - 1];
        return array.length - 1;

    }

// DO NOT TOUCH THE MAIN METHOD

        public static void main(String [] args) {

            Scanner in = new Scanner(System.in);
            boolean runInt = in.nextBoolean();
            int size = in.nextInt();

            if(runInt) {
                int [] arr = new int[size];
                for(int i=0; i < arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println(findMax(arr));
            } else {
                double [] arr = new double[size];
                for(int i=0; i < arr.length; i++) {
                    arr[i] = in.nextInt();
                }
                System.out.println(findMax(arr));
            }

        }
    }

