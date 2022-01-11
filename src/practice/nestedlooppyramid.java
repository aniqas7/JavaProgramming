package practice;

public class nestedlooppyramid {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println();
            for (int j = 0; j < 1; j++) {
                String ch="*";
                System.out.println(ch.repeat(i));
            }

        }
    }
}
