package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class uniquechar {
    public static void main(String[] args) {
        String str= "aaabcccdeef";

   //   char[]ch=  str.toCharArray();

     //  ArrayList<Char> , array list doesn't support primitives, so we can't use
        // to char array

        //String [] arr=stsr.split("");

        ArrayList<String>list=new ArrayList<>(Arrays.asList(str.split("")));//non primitive array to collection type conversion
        System.out.println(list);

        String unique="";

        for (String each : list) {
          int frequency=  Collections.frequency(list,each);
          if(frequency==1){
              unique +=each;
          }
        }
        System.out.println(unique);

    }
}
