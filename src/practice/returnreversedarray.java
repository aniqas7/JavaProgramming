package practice;

import java.util.Arrays;

public class returnreversedarray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reverse = reverse(array);
        System.out.println(Arrays.toString(reverse));


    }

    public static int[] reverse(int[] array) {
        int[] reverse = new int[array.length];

        for (int i = array.length-1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];

        }
        return reverse;

    }
}



