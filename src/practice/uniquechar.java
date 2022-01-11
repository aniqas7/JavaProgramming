package practice;

import org.w3c.dom.ls.LSOutput;

public class uniquechar {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = "";



        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                char ch2 = str.charAt(j);
                if (ch == ch2) {
                    count++;
                }
            }
                if (count != 1) {
                    continue;
                }
               result+=ch;
            }
            System.out.print(result);

        }
    }


