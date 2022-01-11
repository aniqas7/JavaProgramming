package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word= "Cydeo";

        char thirdChar= word.charAt(3);
        System.out.println("thirdChar = " + thirdChar);

        char tenthChar= word.charAt(2);
        System.out.println("tenthChar = " + tenthChar);

        System.out.println("--------");

        String s1= "Batch 25 is the best";

        int totalChars= s1.length();
        System.out.println("totalChars = " + totalChars);

        char lastChar= s1.charAt( s1.length()-1); //last index #
        System.out.println("lastChar = " + lastChar);

        String str= "wooden spoon";
        //string is immutable. str.toUpperCase(); //WOODEN SPOON
        str= str.toUpperCase(); //reassign bc it will give lowercase bc string immutable
        System.out.println(str);

        String s= "JAVA";
        s=s.toLowerCase();
        System.out.println(s);

        String sentence = "Today is a great day to learn JAVA";
        sentence= sentence.toUpperCase();
        System.out.println(sentence);


    }
}
