package practice;

import java.util.Arrays;

public class reversesentencearrays {
    public static void main(String[] args) {
        /*
        1. Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
         */

        String sentence = "Today is a good day to learn Java";
        String [] s= sentence.split(" ");
        System.out.println(Arrays.toString(s));
        String reverse="";


        for (int i = s.length - 1; i >= 0; i--) {
            reverse += s[i]+" ";

        }
        System.out.println(reverse);
            }

        }

        

