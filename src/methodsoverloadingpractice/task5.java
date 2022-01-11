package methodsoverloadingpractice;

import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {

        int[] array1 = {5, 3, 4, 8, 7};
        int result = min(array1);
        System.out.println(result);
        double result1 = min(array1);
        System.out.println(result1);
        float result2 = min(array1);
        System.out.println(result2);
        byte result3 = (byte) min(array1);
        System.out.println(result3);

    }

    public static int min(int[] array) {

        Arrays.sort(array);
        return array[0];

    }

    public static double min(double[] array) {

        Arrays.sort(array);
        return array[0];
    }

    public static float min(float[] array) {

        Arrays.sort(array);
        return array[0];
    }
    public static byte min(byte[] array) {

        Arrays.sort(array);
        return array[0];
    }
}
