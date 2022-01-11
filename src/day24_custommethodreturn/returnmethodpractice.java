package day24_custommethodreturn;

public class returnmethodpractice {
    public static void main(String[] args) {


        //find max num between 100 and 200

        int maxNumber = max(100, 200);
        System.out.println(maxNumber);

        //multiple max num by 2

        int multiplication= maxNumber*2;
        System.out.println(multiplication);
    }


    public static int max(int a, int b) {

        int result = 0;

        if (a > b) {
            result = a;
        } else {
            result = b;
        }
        return result;


    }
}


