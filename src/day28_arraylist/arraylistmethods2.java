package day28_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class arraylistmethods2 {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);

        //list.remove(1);
       // int num=1;
       // list.remove(num);
      //  System.out.println(list);
        Integer num=2000;
       boolean r= list.remove(num);
        System.out.println(list);
        System.out.println(r);


        System.out.println("-------");
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list);
        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a =  characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4

        System.out.println(a);
        System.out.println(b);

        System.out.println("--------------------------------------------");

        boolean r2= characters.contains('Z');
        boolean r3= characters.contains('A');
        System.out.println(r2);
        System.out.println(r3);

        System.out.println("-------------------");
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);

        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);

        System.out.println(list1==list2); //two diff objects in heap memory. bc we used new keyword
        System.out.println(list1.equals(list2));
        //two array list comparing, use equals
        //it will print true bc it has same elements

        System.out.println("-----------");

        boolean r4=list1.isEmpty();
        System.out.println(r4);

        System.out.println("-----------");

        //bulk operation:CollectionType
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));
        System.out.println(numbers);



    }
}
