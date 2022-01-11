package day18_nestedloop;

public class nestedloopintro {
    public static void main(String[] args) {
        for (int j = 0; j < 4; j++) {

            //when j=0, i is repeated 5x
            //outer loop repeats inner loop

            for (int i = 0; i < 5; i++) { //statement we want to repeat

                System.out.println("Wooden Spoon");
            }
            //one iteration of the outer loop,
            //executes all the iteration of inner loop

        }
    }
}
