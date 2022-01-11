package practice;

import java.util.Arrays;

public class mergetwoarrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6};

        int[] arr3= new int[arr1.length+arr2.length];

        int i=0;
        for (int each : arr1) {
            arr3[i++]=each;
        }
        for (int each2 : arr2) {
            arr3[i++]=each2;

        }
        System.out.println(Arrays.toString(arr3));
        }


    }
