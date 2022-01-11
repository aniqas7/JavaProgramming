package custommethodsarraypractice;

import java.util.Arrays;

public class resversestring {
    public static void main(String[] args) {
String word= "Java";
String result= reverse(word);
    System.out.println(result);
    }

    public static String reverse(String word){
//{j,a,v,a}
        char[] ch= word.toCharArray();
        String reverse="";
        for (int i = ch.length - 1; i >= 0; i--) {

            reverse+=ch[i];
        }
        System.out.println(reverse);
        return reverse;
    }

    /*
    3. create a method named reverse that passes one string parameter, the method can return the reversed string

				Ex:
					str = "Java";
					reverse(str) ==> avaJ
     */
}
