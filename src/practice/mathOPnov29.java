package practice;

import java.util.Scanner;

public class mathOPnov29 {
    public static void main(String[] args) {


            Scanner scan = new Scanner(System.in);
            System.out.println("enter num1");
            int num1 = scan.nextInt();

            System.out.println("enter num2");
            int num2 = scan.nextInt();



            System.out.println("enter operator");
            char ch = scan.next().charAt(0);


            while(!((ch == '+') || (ch == '-') || ch == '/' || ch == '*')){
                System.err.println("invalid operator, please reenter operator:");
                ch= scan.next().charAt(0);
            }

                if (ch == '+')
                    System.out.println(num1 + num2);
                else if (ch == '-') {
                System.out.println(num1-num2);

                 } else if (ch == '/'){
                    System.out.println(num1/num2);
                }

                else {
                    System.out.println(num1*num2);
                }


    }



    }

