package day28_arraylist;

import javax.swing.plaf.basic.BasicTreeUI;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class arraylistmethods {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //3
        numbers.add(40); //4
        numbers.add(50); //6
        numbers.add(60); //7
        //add(Data): adds the data after the last index

        numbers.add(2, 25); //2
        numbers.add(5, 45); //5
        //add(index, Data): inserts the data at the given index

        System.out.println(numbers);


        System.out.println( numbers.size() );
        //gets size of array

        int lastIndex = numbers.size() - 1;
        //last index
        System.out.println("lastIndex = " + lastIndex);



        int num = numbers.get(3);
        //returns the element at the given index
        System.out.println("num = " + num);

        System.out.println("------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i) );
        }
        System.out.println("----------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list);

        //set(index,data)= replaces the element at the given index with new element

        System.out.println("---------------");

        ArrayList<String> emloyees=new ArrayList<>();
        emloyees.add("Suat");
        emloyees.add("Aygun");
        emloyees.add("Olga");
        emloyees.add("Neira");
        emloyees.add("Ali");
        emloyees.add("Hulya");
        emloyees.add("Kaloyan");
        System.out.println(emloyees);


        emloyees.remove(0);
        System.out.println(emloyees);
        emloyees.remove(0);
        System.out.println(emloyees);
        emloyees.remove(emloyees.size()-1);
        System.out.println(emloyees);

         boolean r1= emloyees.remove("Hulya");//removing object
        System.out.println(emloyees);

        boolean r2= emloyees.remove("Neira");
        System.out.println(emloyees);

        System.out.println(r1);
        System.out.println(r2);

        //remove(int index):removes the element at the given index
    }
}
