package day10_IfStatement;

public class PassOrFail {

    public static void main(String[] args) {

        int score= 75;

        System.out.println("Congrats, you passed");
        System.out.println("Failed");

        if(score>=60){
            System.out.println("congrats, you passed ");
        }
        else {
            System.out.println("failed");
        }

    }
}
