package practice;

import org.w3c.dom.ls.LSOutput;

public class maxnumcustommeth<max> {
    public static void main(String[] args) {
        //max num from array of integers

        int[] array = {5, 10, 3, 2};
        //for (int i = 0; i <array.length; i++) {
           // int max = max(array, array[i]);
           // System.out.println(array[i]);
        int result= max(array);
        System.out.println(result);
        }


    public static int max(int[] array) {
        int max = array[0];
        for (int each : array) {
            if (max < each) {
                max = each;
            }
        } return max;

    }
}
