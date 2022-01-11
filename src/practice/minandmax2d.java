package practice;

public class minandmax2d {
    public static void main(String[] args) {
        /*
         1. Write a program that can find the minimum and maximum numbers from a two dimensional array
         */

        int[][] array= {{1,2,3},{4,5,6}};
        int max=-2145467;
        int min=2145467;

        for (int[] each : array) {
            for (int j: each){
            if(j>max) {
                max = j;
            }
            if(j<min){
                min=j;
            }

        }
            
        }


    }
}
