package day22_multidimensionalarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class multidimensional3 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        //this is a 2d array
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//3 dimensional array contains 2 d arrays

        //      0       1       2           0           1            2
        //     0 1 2  0 1 2    0 1 2      0 1   2    0   1 2    0 1   2
        int[][][] arr3d = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
        //index num                 0                   1
        //length is 2

        //[index num of 2dArray][index num of 1D Array][index num of elements]

        System.out.println(Arrays.deepToString(arr3d));
        System.out.println(Arrays.deepToString(arr3d[1])); // this is the 2d array from the 3d
        System.out.println(Arrays.toString(arr3d[1][1]));
        System.out.println((arr3d[0][2][2]));

        //in 3d you need to do 2d array bc it contains 2d array

        for (int[][] each2d : arr3d) { //it iterates each 2 dimensional array
            for (int[] each1d : each2d) {
                for (int element : each1d) {
                    System.out.println(element);

                }

            }

            int[][][][] arr4D = {{{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}}};
            //                                                  0

            for (int[][][] each3D : arr4D) {
                for (int[][] each2D : each3D) {
                    for (int[] each1D : each2D) {
                        for (int element : each1D) {
                            System.out.print(element);
                        }
                    }
                }


            }
        }
    }
}
