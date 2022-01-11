package day20_forEach;

import java.util.Arrays;

public class minnum {

        public static void main(String[] args) {

            int[] numbers= {10,5,4,20,1,0};
            int min= numbers[0];

            for(int each:numbers) {
                if (each < min) {
                    min=each;
                }
            }
    }
}
