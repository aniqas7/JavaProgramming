package day04_variables;

public class GallonsToLiters {

    public static void main(String[] args) {

        //convert gallon (int) to liters (double)
        //1 gallon=3.79 liters


        int gallon1= 1000;
        double liter1= gallon1*3.79;

        System.out.println("liter = " + liter1);

        int gallon = 5;
        double liters= 3.79;
        double gallonToLiters= liters *gallon;

        System.out.println("gallonToLiters = " + gallonToLiters);



    }
}
