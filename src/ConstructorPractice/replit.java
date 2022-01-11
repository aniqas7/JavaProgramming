package ConstructorPractice;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class replit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {
//aabbcc
        char[] ch = str.toCharArray();
        String result = "";
        int count = 0;
        for (char each : ch) {
            for (char element : ch) {
                if (each == element) {
                    count++;
                }
                if(result.contains(element+"")){
                    continue;
                }else{
                    result+=""+count+each;
                }
            }

        }
        return result;
    }
}
