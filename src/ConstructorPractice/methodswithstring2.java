package ConstructorPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class methodswithstring2 {

    public static String mergeStrings(String one, String two) {

       char[] word=  one.toCharArray();
       char[] word2= two.toCharArray();

     String merge="";
        int i=0;
        int j=0;
     while(true){
         if(i<word.length){
             merge+=word[i];
             i++;
         }
         if(j<word2.length){
             merge+=word2[j];
             j++;
             continue;
         }
         break;
     }
        return merge;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }

}


