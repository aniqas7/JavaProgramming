package Arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class swapfirstandlast {
    public static void main(String[] args) {
        /*
        2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];

         */

        ArrayList<Integer>numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int lastIndex=numbers.size()-1; //returns index
        int lastnum=numbers.get(lastIndex); //gets value at last index
        int firstnum=numbers.get(0);

        //set(index,data)= replaces the element at the given index with new element
        numbers.set(0,lastnum);
        numbers.set(lastIndex,firstnum);
        System.out.println(numbers);


    }
}
