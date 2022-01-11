package practice;

import java.util.Arrays;

public class common {
    public static void main(String[] args) {
        /*
        . Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
         */
        int[] arr1={1,2,3,4,5};
        int[] arr2={4,5,6,7,8};

        int[] result= new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {

            int art1=arr1[i];

            for (int j = 0; j < arr2.length; j++) {

                int art2=arr2[j];

                if(art1==art2){
                    System.out.print(art1);

            }

            }

            }

            }

        }


