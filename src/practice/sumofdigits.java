package practice;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter a string: ");
        String word= scan.next();

        int sum = 0;
        //A1B2C3

        for (int i = 0; i < word.length(); i++) {
            char ch= word.charAt(i);

            if (ch>='0' && ch<='9'){
                sum+=word.charAt(i)-'0';

                } else {
                System.out.println("");

        }
        }

        System.out.println(sum);
        scan.close();
    }
}
