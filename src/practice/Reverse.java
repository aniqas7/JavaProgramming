package practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter a word:");
        String word=  scan.next();
        String result= "";

        if (word.length()==5){

            result = ""+ word.charAt(4) + word.charAt(3)
                    + word.charAt(2)+ word.charAt(1)+ word.charAt(0);
        }
        else if(word.length()>5){
            result= "too long!";
        }
        else {
            result="too short!";
        }

        System.out.println(result);

    }
}
