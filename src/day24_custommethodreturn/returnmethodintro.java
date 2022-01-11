package day24_custommethodreturn;

import java.beans.PropertyEditorSupport;

public class returnmethodintro {
    public static void main(String[] args) {
        String str = "ava";
        String result = reverse(str);
        System.out.println(result);
        if (str.equalsIgnoreCase(result)) {
            System.out.println(str+" is palindrome");
        } else {
            System.out.println(str+" isn't palindrome");

        }
    }
        public static String reverse (String str){
            String reverse = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                reverse += str.charAt(i);
            }
            System.out.println(reverse);
            return reverse;

        }

    }
