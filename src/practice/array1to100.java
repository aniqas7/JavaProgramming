package practice;

import java.util.Arrays;

public class array1to100 {
    public static void main(String[] args) {

        int []num= new int[100];

        for (int i = 0; i <num.length-1 ; i++) {
            num[i]=i+1;

        }
        System.out.println(Arrays.toString(num));

        System.out.println("--------------");

        for (int i = num.length - 1; i >= 0; i--) {
            num[i]=num.length-i;

        }
        System.out.println(Arrays.toString(num));

        }
        }




