package day20_arrays;

import java.util.Arrays;

public class arrayspractice {
    public static void main(String[] args) {

//fourth element= index[3]
    //store the elements:10,20,50,70

    int[] numbers = {10, 20, 50, 70}; //size=4
        System.out.println(Arrays.toString(numbers));

        //store 5 scores in a variable

        int[]scores=new int[5];

        scores[0]=0;
        scores[scores.length-1]=85;
        scores[2]=85;
        scores[3]=90;
        scores[4]=95;

        System.out.println(Arrays.toString(scores));



}
}
