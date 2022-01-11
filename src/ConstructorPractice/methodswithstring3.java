package ConstructorPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class methodswithstring3 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
            Arrays.toString(do_switch(arr));

        }


    public static int[] do_switch(int[] i) {
        // your codes here:

        int[] array=new int [i.length];
        int k=0;
        for (int each : i) {
            array[k]+=each;
            k++;
        }
        k= array[0];
        array[0]=array[3];
        array[3]=k;

        String arr1=Arrays.toString(array);
        System.out.println(arr1);
        return array;
    }

}