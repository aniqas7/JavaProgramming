package Day05Concatination;

public class Calculator {
    public static void main(String[] args) {

        int firstNumber= 100;
        int secondNumber= 50;
        int addition= (firstNumber+ secondNumber);
        int subtraction= (firstNumber-secondNumber);
        int multiplication= (firstNumber*secondNumber);

        System.out.println(firstNumber + " + " + secondNumber + " = " + addition);

        //100+50=150

        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
        System.out.println(firstNumber + " + " + secondNumber + " = " + (addition));
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));

        //100-50=50

        System.out.println(firstNumber+ " - " + secondNumber + " = " + (subtraction));
        System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber-secondNumber));

        //100*50=5000

        System.out.println(firstNumber + "*" + secondNumber + " = " + multiplication);
        System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber*secondNumber));
    }
}
