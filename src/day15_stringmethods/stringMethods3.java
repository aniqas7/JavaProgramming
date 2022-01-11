package day15_stringmethods;

import java.util.Locale;

public class stringMethods3 {
    public static void main(String[] args) {
        String str = " "; //less than 1 space ""

        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1); //white spaces in string "    " no longer empty, but its blank

        String str2 = "Cydeo   ";
        boolean r3 = str2.isBlank();
        System.out.println(r3);

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String sentence = "My favorite programming language is Java";

        boolean hasCsharp = sentence.contains("C#");
        System.out.println(hasCsharp);

        boolean hasJava = sentence.contains("Java");
        System.out.println(hasJava);

        boolean hasJava2 = sentence.contains("java");
        System.out.println(hasJava2);

        boolean hasJava3 = sentence.toLowerCase().contains("java");
        System.out.println(hasJava3);

        boolean r4 = sentence.contains("java") || sentence.contains("Java"); //jAvA


        String input1 = "I love Java";
        String input2= "Java";
        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains("Java"));
        System.out.println(input1.toUpperCase().contains("JAVA"));


    }
}
