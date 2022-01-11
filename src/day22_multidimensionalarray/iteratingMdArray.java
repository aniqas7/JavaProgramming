package day22_multidimensionalarray;

import java.util.Arrays;

public class iteratingMdArray {
    public static void main(String[] args) {
        // index of elements 0 1 2   0 1 2 3    0 1 2 3 4 5
        int[][]arr2d={ {1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //index             0       1           2

        for (int i = 0; i < arr2d.length; i++) {//i=index num of single dimensional array
            //0r <=arr2d.length-1

           // System.out.println(Arrays.toString(arr2d[i]));//each of single dimensional array
            //retrieve each element
            for (int j = 0; j < arr2d[i].length ; j++) {//j:index num of elements
                System.out.print((arr2d[i][j]+" "));
            }
            System.out.println("");

        }



    }
}
