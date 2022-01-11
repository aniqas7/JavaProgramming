package practice;

import java.util.Arrays;

public class example {
    public static void main(String[] args) {

        String [] arr= {"Strawberry", "Apple", "Banana"};
        String [] result= new String[arr.length];

        System.out.println(Arrays.toString(arr));

        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            result[j]=arr[i];
        }
        System.out.println(Arrays.toString(result));


    }
}
