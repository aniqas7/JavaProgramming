package day15_forLoops;

public class alphabet {
    public static void main(String[] args) {

        //65-90

        //print A-Z -->

        /*
        for (int i=65; i<=90; i++){

            System.out.print((char) i+ " "); //cast it to char or else itll print number
        }
        System.out.println();


         */
        for (char i='A'; i>='Z'; i++) {
            System.out.print(i + " ");
        }

        for (char i= 'Z'; i>='A'; i--){
            System.out.print(i+" ");

        }

        for(char i= 1; i<=40000; i++){
            System.out.print(i+" ");
        }



        }
    }

