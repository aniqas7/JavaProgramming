package practice;

import java.util.Arrays;

public class reverse2d {
    public static void main(String[] args) {

        int [][]array = { {1,2,3}, {4,5,6}};

        int [][]array1= new int[array.length][array[0].length];

            for (int i = array.length - 1, k=0; i >= 0; i--, k++) {


                for (int j = array[i].length - 1, l=0; j >= 0; j--, l++) {

                array1[k][l]=array[i][j];

            }

            }
        System.out.println(Arrays.deepToString(array1));

            }

        }

