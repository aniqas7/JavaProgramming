package day28_arraylist;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer>list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2); //set(index,data) replaces what is at that index w/ new element
            //get method gets specific element at specific index
        }
        System.out.println(list);
    }

}
