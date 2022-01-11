package day23_custommethods;

public class custommethodswithparameters {
    public static void main(String[] args) {
        evenorodd(10); //method demands additional information
        age(1997);
    }
    public static void evenorodd (int number) {
        if (number % 2 == 0) {

        System.out.println(number + " number is even");
    }else{
                System.out.println("odd");

        }
    }

    //display age of the person

    public static void age(int birthyear){
        int age=2021-birthyear;
        System.out.println("your age: "+age);

    }



}
