package day22_multidimensionalarray;

import java.util.Arrays;

public class iteratingMDarrays2 {
    public static void main(String[] args) {
        // index of elements 0 1 2   0 1 2 3    0 1 2 3 4 5
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};
        //index         0           1           2



        for (int i = arr2d.length - 1; i >= 0; i--) {//index num of 1 dimensional array starting from last index to 0

            // System.out.println(Arrays.toString(arr2d[i]));
            //each single dimensional array from two dimensional array variable

            for (int j = 0; j < arr2d[i].length; j++) {
                //starts from zero. zero till last index of EACH single dimensional array
                //j is index number of element.

                System.out.print(arr2d[i][j] + " ");

            }
            System.out.println();
        }

            //task2

            // print 321, 8-4, 13-9

            for (int k = 0; k < arr2d.length; k++) {//index num of 1 dimensional array starting from last index to 0

                // System.out.println(Arrays.toString(arr2d[i]));
                //each single dimensional array from two dimensional array variable

                for (int l = arr2d[k].length - 1; l >= 0; l--) {
                    //starts from zero. zero till last index of EACH single dimensional array
                    //j is index number of element.

                    System.out.print(arr2d[k][l] + " ");

                }
                System.out.println();


            }
        for (int k = arr2d.length - 1; k >= 0; k--) {
            
        //index num of 1 dimensional array starting from last index to 0

            // System.out.println(Arrays.toString(arr2d[i]));
            //each single dimensional array from two dimensional array variable

            for (int l = arr2d[k].length - 1; l >= 0; l--) {
                //starts from zero. zero till last index of EACH single dimensional array
                //j is index number of element.

                System.out.print(arr2d[k][l] + " ");

            }
            System.out.println();

        }
        }
    }

//9 10 11 12 13
//4 5 6 7
//1 2 3