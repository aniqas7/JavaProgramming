package practice;

import java.util.Locale;
import java.util.Scanner;

public class catanddog {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        System.out.println("enter string: ");
        String str= scan.nextLine();


        str= str.toLowerCase();


        int numbercat=0;
        int numberdog=0;

        for (int i = 0; i <str.length() ; i++) {

            if (str.contains("cat")) {

                str=str.replaceFirst("cat", "");
                numbercat += 1;
            }
            else if (str.contains("dog")) {

                str=str.replaceFirst("dog", "");
                numberdog += 1;
            }
        }

           boolean isTrue= numbercat==numberdog;
        System.out.println(isTrue);



scan.close();
    }
}





