package day17_whileLoops;

public class evennum {
    public static void main(String[] args) {
        for (int i = 0; i <=10; i++) {
            //even
            if (i % 2 != 0) {
                continue;//skip
            }
            System.out.println(i);
        }

            for (int i = 0; i <=10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.println(i);

        }
    }
}
