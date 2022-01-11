package day10_nestedIf;

public class Ternaries {
    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

        //ternary

        String result1 = (n % 2 == 0) ? "even" : "odd";
        System.out.println(result1);

        int age= 23;
        if (age>=21){
            System.out.println("eligible");
        }
        else {
            System.out.println("Not eligible");
        }
        

        String result2= (age>=21)? "eligible" : "not eligible";
        System.out.println(result2);

        //new ex.

        int number=100;
        if (number>0){
            System.out.println("positive");
        }
       else if (number<0){
            System.out.println("negative");
        }
        else {
            System.out.println("Zero");
        }

// : ( else if block
        String result3= (number>0)? "positive" : (number<0)?  "negative" : "zero";
        System.out.println(result3);
    }
}
