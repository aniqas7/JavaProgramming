package day10_IfStatement;

public class PosNegZero {
    public static void main(String[] args) {
        int n=100;

        //single if statement
        if(n>0){
        System.out.println("positive");
        }
        if (n<0) {
            System.out.println("negative");
        }
        if (n==0) {
            System.out.println("zero");
        }

        //multibranch if statement

        if (n>0){
            System.out.println("positive");
        }
        else if (n<0) {
            System.out.println("negative");
        }
        else{
            System.out.println("zero");
        }



    }
}
