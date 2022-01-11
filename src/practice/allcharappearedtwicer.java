package practice;

import java.util.Scanner;

public class allcharappearedtwicer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result = "";

        for (int i = 0; i < word.length(); i++) {

            int count = 0;
            char ch = word.charAt(i);

            for (int j = 0; j < word.length(); j++) {
                char ch1 = word.charAt(j);

                if (ch == ch1) {
                    count++;
                }

                }
            if (count ==2) {
                result += ch;
            }
        }
            System.out.println(result);

    }
}
