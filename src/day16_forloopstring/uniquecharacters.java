package day16_forloopstring;

public class uniquecharacters {
    public static void main(String[] args) {
        String str = "aaabccc";

        String result = "";

        for (int i = 0; i < str.length(); i++) {


            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                result += ch;
            }

        }
    }
}
