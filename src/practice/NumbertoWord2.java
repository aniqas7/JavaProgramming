package practice;

public class NumbertoWord2 {
    public static void main(String[] args) {

        int num=5;

        if(num>=0 && num<=4){

            switch (num){

                case 0:
                    System.out.println("zero");
                    break;

                case 1:
                    System.out.println("one");
                    break;

                case 2:
                    System.out.println("two");
                    break;

                case 3:
                    System.out.println("three");
                    break;

                default:
                    System.out.println("four");
            }
        }

        else {
            System.out.println("not valid");
        }
    }
}
