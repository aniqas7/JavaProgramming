package day19_nestedloop;

public class ExitMethod {
    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {
          if(i==3){
             // break; //terminates the loop//
              // continue; //terminates the current interation . skip 3, rest num printed

              System.exit(0); //terminates the program

          }
            System.out.println(i);
        }
        System.out.println("wooden spoon");
    }
}
