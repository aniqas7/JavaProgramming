package practice;

import java.util.Arrays;

public class arrayappearances {
    public static void main(String[] args) {

        /*
        6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task 97 in repl.it, but this time you MUST use arrays and for each loop)

         */

        String sentence= "java is not as fun as python python is easy.";

        String [] array= sentence.split(" ");
        System.out.println(Arrays.toString(array));

        int countjava=0;
        int countpython=0;
        for (String each : array) {
            if(each.equals("java")){
                countjava++;
            }
            else if(each.equals("python")){
                countpython++;
            }

        } System.out.println("java: "+ countjava);
        System.out.println("python: "+ countpython);


    }
}
