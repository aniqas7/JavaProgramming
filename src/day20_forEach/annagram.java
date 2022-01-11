package day20_forEach;

import java.util.Arrays;

public class annagram {
    public static void main(String[] args) {
        String str1 = "acdb";
        String str2 = "dcba";

        char[]ch=str1.toCharArray();
        char[]ch2=str2.toCharArray();


        Arrays.sort(ch);
        Arrays.sort(ch2);

       // System.out.println(Arrays.toString(ch));
       // System.out.println(Arrays.toString(ch2));

        boolean istrue=Arrays.equals(ch,ch2);
        System.out.println(istrue);




    }
}
