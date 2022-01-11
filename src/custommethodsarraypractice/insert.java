package custommethodsarraypractice;

import java.util.Arrays;

public class insert {
    public static void main(String[] args) {
       int[] arr = {10, 20, 30, 40, 50};
          int[] arr2 =insert(arr,2,100);
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] insert(int[] array, int index, int element){
        int[] result=new int [array.length+1];

        for (int i = 0; i <= index; i++) {
            result[i]=array[i];
            if(i==index){
                result[i]=element;
            }
        }
        for (int i = index; i < array.length; i++) {
                result[i+1]+=array[i];


            }
        return result;
    }
}
/*
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element. the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array


 */
