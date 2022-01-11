package utility;

public class mathUtility {
    public static void main(String[] args) {
        int addition=  sum(4,5);
        System.out.println(addition);
        double addition1=  sum(4.0,5.0);
        System.out.println(addition1);

        int subtraction=  subtract(10,5);
        System.out.println(subtraction);
        double subtraction1=  subtract(6.0,5.0);
        System.out.println(subtraction1);

        int multiplication=  product(10,5);
        System.out.println(multiplication);
        double multiplication1=  product(10.0,5.0);
        System.out.println(multiplication1);


        double divison1=  divisible(10.0,2.0);
        System.out.println(divison1);

        int max=  max(10,5);
        System.out.println(max);
        double max1=  max(10.0,2.0);
        System.out.println(max1);

        String even1=  even(10);
        System.out.println(even1);
        String odd1=  odd(5);
        System.out.println(odd1);

        int squarez= square(4);
        System.out.println(squarez);
        double squarez1= square(4);
        System.out.println(squarez1);

    }

    public static int sum(int one, int two){

        return one+two;
    }
    public static double sum(double one, double two){
        return one+two;
    }
    public static int subtract(int one, int two){
        return one-two;
    }
    public static double subtract(double one, double two){
        return one-two;
    }
    public static int product(int one, int two){
        return one*two;
    }
    public static double product(double one, double two) {
        return one * two;
    }

    public static double divisible(double one, double two){
        return one/two;
    }
    public static int max(int one, int two){
       int max=0;
        if(one>two){
           max= one;
        }else{max=two;
        }
        return max;
    }
    public static double max(double one, double two){
   double max=0;

        if(one>two){
            max= one;
        }else{max=two;
        }
        return max;
    }

    public static String even(int one){
       String result="";
        if(one%2==0){
            result="even";
        }else{result="odd";
        }
        return result;
    }
    public static String odd(int one){
        String result="";
        if(one%2==0){
            result="even";
        }else{result="odd";
        }
        return result;
    }
    public static int square(int one) {

        int square1=0;
         square1 = one*one;

        return square1;
    }
    public static double square(double one) {

        double square1=0;
        square1 = one*one;

        return square1;
    }


}
