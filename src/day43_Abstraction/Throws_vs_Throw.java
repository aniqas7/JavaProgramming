package day43_Abstraction;

import java.util.Scanner;

public class Throws_vs_Throw {
    //throw= manually throw an exception

    public static void main(String[] args) {
        System.out.println("enter your score:");
        Scanner scan=new Scanner(System.in);
        int score= scan.nextInt();

        if (score<0 || score>100) {
            throw new RuntimeException("invalid score");
        }
        if(score>=90){
            System.out.println("A");
        }
        else if (score>=80){
            System.out.println("B");
        }
        else if (score>=70){
            System.out.println("C");
        }
        else if (score>=60){
            System.out.println("C");
        }else{
            System.out.println("F");
        }
        System.out.println("hello world");
    }
}
