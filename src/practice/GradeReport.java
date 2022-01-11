package practice;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter score");
        int score= input.nextInt();

        input.close();


        if (score<100 && score >0) {
            if (score>=90)
            System.out.println("A");

            else if (score >=80)
                System.out.println("B");
            else if (score >=70)
                System.out.println("C");
            else if (score >=60)
                System.out.println("D");
            else{
                System.out.println("F");
            }

        } else {
            System.out.println("invalid score");

        }
        System.out.println("score= "+score);
    }
}

