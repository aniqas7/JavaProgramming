package day22_multidimensionalarray;

import java.util.Arrays;

public class MDintro {
    public static void main(String[] args) {


        String[] group1={"Jan","Joes", "James"};
        String[] group2={"Jan","Joes", "James"};
        String[] group3={"Jan","Joes", "James"};

        String [][]groups= new String [3][]; //index=0,1,2
        //when we don't know what the arrays are, only the number of arrays is known
        //number of arrays in first bracket/capacity
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;
       // System.out.println(Arrays.toString(groups));
        //toString method is for single dimensional array

        System.out.println(Arrays.deepToString(groups));
/*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
 */ //when you know what the arrays are...
  // index of elements 0 1 2   0 1 2 3    0 1 2 3 4 5
        int[][]arr2d={ {1,2,3},{4,5,6,7},{8,9,10,11,12}};
    //index             0       1           2
        System.out.println(Arrays.deepToString(arr2d));

//retrieve {4,5,6,7} ..array

        System.out.println(Arrays.toString(arr2d[1])); //to print single dimensional array, you need to string method
        System.out.println((arr2d[2][3])); //this returns an element, not an array





    }
}
