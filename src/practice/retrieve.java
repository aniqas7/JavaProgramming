package practice;

import java.util.Scanner;

public class retrieve {
    public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        System.out.println("enter a string:");
        String word= scan.next();

        String digits="";
        String letters="";
        String specialChars="";


        for (int i = 0; i < word.length(); i++) {

            char ch= word.charAt(i);
            if(ch>='0' && ch<='9'){
                digits +=ch;
            }
            else if(ch>='a' && ch<='z' || ch>'A' && ch<='Z'){
                letters +=ch;
            }
            else {
                if (ch!=(' ')){ //character isnt a space
                    specialChars +=ch;
                }
            }

        }
        System.out.println("digits= "+ digits);
        System.out.println("letters= " + letters);
        System.out.println("specialchars= "+ specialChars);


        //hi123@#
scan.close();


    }
}
