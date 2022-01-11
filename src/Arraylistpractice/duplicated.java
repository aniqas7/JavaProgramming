package Arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class duplicated {
    public static void main(String[] args) {
        /*
        7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
         */
        ArrayList<Integer>number=new ArrayList<>();

        number.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));
        int count=0;


        for (Integer each : number) {
            if(number.indexOf(each)!=number.lastIndexOf(each)){
                System.out.println(each);
                break;
        }

        }
    }
}
