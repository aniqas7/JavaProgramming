package day27_wrapperclass;

import utility.ArraysUtility;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 2, 4, 4, 9};
        arr1 =array(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] array(int[] array) {
        int[] result = {};

        for (int each : array) {

            if (!(ArraysUtility.contains(result, each))) {
              result = ArraysUtility.addElement(result, each);
            }

        }return result;

    }
}

