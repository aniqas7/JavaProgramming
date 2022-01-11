package day27_wrapperclass;

import java.util.Arrays;

public class replace<Public> {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        arr = replace(arr, 0, 30);
        System.out.println(Arrays.toString(arr));
        String[] arr1={"hello","java","python"};
        arr1=replace(arr1,1,"C#");
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] replace(int[] array, int index, int newElement) {

        if (index <0 || index > array.length-1) {
            System.out.println("error");
            System.exit(0);

        }
        array[index] = newElement;
        return array;


        }
    public static double[] replace(double[] array, int index, double newElement) {

        if (index <0 || index > array.length-1) {
            System.exit(0);

        }
        array[index] = newElement;
        return array;
    }
    public static char[] replace(char[] array, int index, char newElement) {

        if (index <0 || index > array.length-1) {
        System.exit(0);

        }
        array[index] = newElement;
        return array;
        }
    public static String[] replace(String[] array, int index, String newElement) {

        if (index <0 || index > array.length-1) {
            System.exit(0);

        }
        array[index] = newElement;
        return array;
    }
        }


