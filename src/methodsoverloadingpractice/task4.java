package methodsoverloadingpractice;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int array[] = {5, 10, 20, 4, 1};

        int result = max(array);
        System.out.println(result);
        double result1=max(array);
        System.out.println(result1);
        long result2=max(array);
        System.out.println(result2);
        short result3= (short) max(array);
        System.out.println(result3);

    }

    public static int max(int[] arr) {

        Arrays.sort(arr);
        return arr[arr.length - 1];

    }

    public static double max(double[] arr) {

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static long max(long[] arr) {

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    public static short max(short[] arr) {

        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}