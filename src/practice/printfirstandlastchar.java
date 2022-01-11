package practice;

import java.util.Arrays;
import java.util.Scanner;

public class printfirstandlastchar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        //String[] array2 = new String[words.length];
/*
        for (int i = 0; i < words.length; i++) {

            String name = ""+words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
            System.out.println(name);
        }
*/


        for (String name : words) {
            System.out.println("" + name.charAt(0) + name.charAt(name.length() - 1));
            // System.out.println(Arrays.toString(array2));


        }
    }
}


