package custommethodsarraypractice;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int [] array = {10, 20, 30, 40};
        int[] reversed= new int[array.length];
        reversed=reversedarray(array);
        System.out.println((Arrays.toString(reversed)));

    }
    public static int[] reversedarray(int[] array){

        int[] result= new int[array.length];
        int j=0;
        for (int i = array.length - 1; i >= 0; i--,j++) {
            result[j]=array[i];

        }return result;

        }

    }

    /*
    8. Create method named reverse that passes an integer array parameter, the method can return the reversed array

				Ex:
					arr = {10, 20, 30, 40};

					reverse(arr) ==> {40, 30, 20, 10}

     */
