package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {

        String[] countries={"Japan","Korea","United Stats", "Turkey", "United Kingdom","Canada"};

        //converting array to arraylist
        ArrayList<String> list=new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length()>=10);

        //converting  arraylist back to array

       countries= list.toArray(new String[0]);//object of array list
        System.out.println(Arrays.toString(countries));

    }
}
