package custommethodsarraypractice;

import java.util.ArrayList;
import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int []arr = {10, 20, 30, 40, 50};
     int[]array3   =swap(arr,2,4);
        System.out.println(Arrays.toString(array3));
        /*
        arr = {10, 20, 30, 40, 50};
				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

         */
    }

    public static int[] swap(int[] array, int i, int j) {
        int[]result=new int[array.length];

        for (int i1 = 0; i1 < array.length; i1++) {
          int temp=array[i];
          array[i]=array[j];
          array[j]=temp;


            } return array;
        }

    }


/*
2.1 Create a method named swap that passes three parameters: integer array, integer i, integer j. the method swaps the element at index i with the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};

				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}

	2.2 Create the same function for double array, char array and string array


 */