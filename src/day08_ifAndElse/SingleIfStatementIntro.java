package day08_ifAndElse;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        int number = 101;

        /*..*/

        boolean evenNumber= number%2==0;
        boolean oddNumber = !evenNumber;

        if(evenNumber){
            System.out.println(number+" Even Number");

            }


        if(oddNumber) {
            System.out.println(number + " Odd Number");

        }

        int n=200;

        //positive
        if (n>0){
            System.out.println(n+ " positive");
        }

        if (n<0){
            System.out.println(n+ "negative");
        }

        if (n==0){
            System.out.println(n+ " zero");
        }





        //if odd print this line below
       // System.out.println("Odd Number");

        //if even print this line below
       // System.out.println("Even Number");


    }
}
