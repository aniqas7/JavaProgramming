package Arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class max {
    public static void main(String[] args) {

        /*
        5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
         */

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));

        int max = numbers.get(0);
        for (Integer each : numbers) {
            if (each >= max) {
                max = each;
            }

        }
        System.out.println(max);
    }
}
