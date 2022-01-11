package day17_whileLoops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class marriageproposal {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Will you marry me? Yes/No");
        String a= scan.next().toLowerCase();

        while(!(a.equals("yes")||(a.equals("no")))){
            System.out.println("invalid statement");
            System.out.println("Will you marry me? Yes/No");

            a=scan.next().toLowerCase();
        }

        if (a.equals("yes")){
            System.out.println("congrats");
        }
        else{
            System.out.println("goodbye");
            scan.close();
        }
    }
}

