package custommethodsarraypractice;

import java.util.Arrays;

public class addelement {
    public static void main(String[] args) {
int[]array={1,2,3};
int number=4;
int[]finalarray=array(array,number);
        System.out.println(Arrays.toString(finalarray));
    }

    public static int[] array(int[]array, int number){

        int[] array2= new int[array.length+1];
        int i=0;
        for (int each : array) {
           array2[i++]=each;

        } array2[array2.length-1]=number;
       // System.out.println(Arrays.toString(array2));
        return array2;

    }
    /*
    6. create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

     */
}
