package day17_whileLoops;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i < 'Z'; i++) {
            if(i=='F'){
                break;

            }
            System.out.println(i+" ");

        }
        Scanner scan= new Scanner(System.in);
        while(true){
            System.out.println("enter a number: ");
            int num= scan.nextInt();

            if(num<0){
                break;
            }
        }
    }
}
