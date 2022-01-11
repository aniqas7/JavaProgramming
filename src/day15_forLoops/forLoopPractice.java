package day15_forLoops;

public class forLoopPractice {
    public static void main(String[] args) {
        //display numbers 15-45

        for (int i=15; i<=45; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nhello");

        //100 99 98 97....50

        for (int i=100; i>=50; i--){
            System.out.print(i+" ");
        }

        //print all even numbers b/w 1 through 55

        for(int i=1; i<=55; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("-----------");

        //print all even numbers b/w 1-55

        for (int i=2; i<=54; i+=2){
            System.out.println(i+" ");
        }


    }
}

