package day10_nestedIf;

import org.w3c.dom.ls.LSOutput;

public class TernariesWithNestedIf<score> {
    public static void main(String[] args) {

        int s = 85;

        if (s >= 0 && s <= 100) {

            if (s > 59) {
                System.out.println("pass");
            } else {
                System.out.println("fail");
            }

        } else {
            System.out.println("Invalid score");
        }

        //ternaries

        String score = (s >= 0 && s <= 100) ? (s > 59) ? "Passed" : "Fail" : "Invalid score";




    // grades

    int s1 = 75;

    String score1 = (s1 >= 0 && s <= 100) ? (s1 > 90) ? "Excellent" : (s1 > 80) ? "Great" : (s1 > 70) ? "good" : (s1 > 60) ? "passed" : "failed" : "invalid score";

    System.out.println(score1);

}
}

