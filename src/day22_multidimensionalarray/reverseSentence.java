package day22_multidimensionalarray;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverseSentence {
    public static void main(String[] args) {

      String sentence = "Today is a good day to learn Java";

      String[] words=sentence.split(" ");

      System.out.println(Arrays.toString(words));

      String reversedsentence="";

        for (int i = words.length-1; i >=0 ; i--) {
            reversedsentence+= words[i]+" ";

        }
        System.out.println(reversedsentence);




        /*
        Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today

         */
    }
}
