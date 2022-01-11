package day28_arraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class uniqueelements {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        System.out.println(list);

        ArrayList<String>unique= new ArrayList<>();

        for(String each: list){
            if(list.indexOf(each)==list.lastIndexOf(each)){
                unique.add(each);
            }

        }
        System.out.println(unique);





    }
}
