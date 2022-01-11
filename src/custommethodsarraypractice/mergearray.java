package custommethodsarraypractice;

import java.util.Arrays;

public class mergearray {
    public static void main(String[] args) {
       int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};

       int[] merged=array(arr1,arr2);
        System.out.println(Arrays.toString(merged));

    }
    public static int[] array(int[]arr1,int[]arr2){
        int[] arr3=new int[arr1.length+arr2.length];
        int i=0;
        for (int each : arr1) {
        arr3[i++]=each;
    }
        for (int each2 : arr2) {
            arr3[i++]=each2;

        } return arr3;

        }

        /*
        7. Create a method named merge that passes two integer array parameters, the method can merge two integer arrays and return the new array

				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}

					merge(arr1, arr2) ====> {1,2,3,4,5,6}


         */
}
