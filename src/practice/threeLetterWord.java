package practice;

import java.util.Scanner;

public class threeLetterWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a three letter word");
        String tlw = input.next();
input.close();

        int length = tlw.length();



        if (length == 3) {

            if (tlw.charAt(1) == 'a') {
                System.out.println("cool word");
            } else {
                System.out.println("okay word");
            }

        }else {
            if (length<3){
                System.out.println("word too short");
            }
            else {
                System.out.println("word too long");
            }
        }

        }

    }

