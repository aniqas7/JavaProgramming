package practice;

import java.util.Scanner;

public class empty {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        System.out.println("enter string: ");
        String variable= input.nextLine();

        int length = variable.length();
        String longerthan3= variable.substring(variable.lastIndexOf("")-3, variable.lastIndexOf(""));

        if (length==0){
            System.out.println("empty");
        }

        else if (length>3){
            System.out.println(longerthan3);
        }
        else {
            System.out.println(variable);
        }


input.close();









        /*
        String variable= "";
        System.out.println("enter string");
        variable= input.nextLine();

        System.out.println(variable.length());

        int length= variable.length();
        System.out.println(length);

        if (length==0){
            System.out.println("empty");
        }
        else if (length>3){

        }

         */

    }
}
