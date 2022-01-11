package day18_nestedloop;

public class astrek {

    public static void main(String[] args) {


        String a= "*";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.print(a+a.repeat(1));
            }
            System.out.println();
        }
    }

}
