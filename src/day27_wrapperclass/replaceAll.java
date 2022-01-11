package day27_wrapperclass;

import java.util.Arrays;

public class replaceAll {
    public static void main(String[] args) {
        int []arr1={1,30,2,30,5,30};
        array(arr1,30,5);
        System.out.println(Arrays.toString(arr1));
    }
    public static int[] array(int[] array, int oldelement, int newelement){

        for (int i = 0; i < array.length; i++) {
            if(array[i]==oldelement){
                array[i]=newelement;
        }
        }return array;

    }
    public static String[] array(String[] array, String oldelement, String newelement){

        for (int i = 0; i < array.length; i++) {
            if(array[i].equalsIgnoreCase(oldelement)){
                array[i]=newelement;
            }
        }return array;

    }
}
