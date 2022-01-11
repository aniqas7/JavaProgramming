package practice;

import java.util.Arrays;

public class mergearrayscustommethods {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 8};
        int[] merged = array(array1, array2);
        System.out.println(Arrays.toString(merged));

    }

    public static int[] array(int[] array1, int[] array2) {
        int i = 0;
        int[] array3 = new int[array1.length + array2.length];
        for (int i1 : array1) {
            array3[i++] = i1;
        }
        for (int i2 : array2) {
            array3[i++] = i2;
        }
        return array3;
    }

}
