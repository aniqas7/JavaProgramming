package practice;

public class LogicalOperators {

    public static void main(String[] args) {

        //logical AND:
        boolean result1= 10 > 5 && 10 > 7; //true
        boolean result2= 20 > 15 && 20 > 25; //true
        boolean result3= 30 > 50 && 30 > 10; //false

        //logical OR:
        boolean result4= 100==200 || 100!=300; //true
        boolean result5= 1000>900 || 1000<2000; //true
        boolean result6= 7 < 0 || 7 > 15; //false

        //logical NOT:
        boolean result7= !true; //opposite of true is false
        boolean result8= !false; //true
        boolean result9= !(100 ==200); //opp of false is true

        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);




    }
}
