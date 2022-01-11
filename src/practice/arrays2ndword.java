package practice;

import java.util.Arrays;

public class arrays2ndword {
    public static void main(String[] args) {
        /*
        2. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
         */

        String sentence="I Love Java";
        String [] array= sentence.split(" ");
        System.out.println(Arrays.toString(array));
        String reverse= "";


        for (int i = array[1].length() - 1; i >= 0; i--) {
            reverse+=array[1].charAt(i);
        }
        System.out.println(reverse);
        sentence=sentence.replaceFirst(array[1],reverse);
        System.out.println(sentence);
    }
}
