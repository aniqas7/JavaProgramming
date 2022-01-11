package Arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;

public class combinetwostringarrays {
    public static void main(String[] args) {

        String[] arr1 = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> str = new ArrayList<>();

        str.addAll(Arrays.asList(arr1));
        str.addAll(Arrays.asList(arr2));
        System.out.println(str);



    /*
    4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}


        ArrayList<String> str = new ArrayList<>();
        str.add("A");
        str.add("B");
        str.add("C");

        ArrayList<String> str2 = new ArrayList<>();
        str.add("D");
        str.add("E");
        str.add("F");

       str.addAll(str2);
        System.out.println(str);

*/






    }
}
