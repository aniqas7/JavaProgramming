package day25_custommethodoverloading;

import utility.ArraysUtility;

public class test2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEach(arr1);


        char[] arr3 = {'A', 'B', 'C', 'D'};
        ArraysUtility.printEach(arr3);

        int[] n1 = {1, 2, 3, 4, 5, 6};
        int max1 = ArraysUtility.max(n1);
        System.out.println(max1);
    }
}


