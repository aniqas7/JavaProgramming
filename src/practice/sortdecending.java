package practice;

import java.util.Arrays;

public class sortdecending {
    public static void main(String[] args) {

        int [] arr1={0,5,2,3,1};
        //decending order

        int [] reversed= new int[arr1.length];
        int decending=0;
       Arrays.sort(arr1);

        for (int i = arr1.length - 1; i >= 0; i--) {

           int numbers= arr1[i];
           reversed[decending++]=arr1[i];
        }
        System.out.println(Arrays.toString(reversed));

    }
}
