package practice;

import java.util.Scanner;


public class frequency {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        System.out.println("enter a string: ");
        String str = scan.next();
        System.out.println("enter a char");
        String ch = scan.next();


        //maanggo
        //a


        int ch1 = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            char ch2 = str.charAt(i);
            if (ch.equals(ch2+"")) {
                ch1 += 1;
            }
        }

            System.out.println(ch1);


        }



}


