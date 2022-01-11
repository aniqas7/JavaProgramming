package practice;

public class RelationalOperators {

    public static void main(String[] args) {

        //greater than:

        boolean result1= 100>90; //true
        boolean result2= 200>300; //false
        System.out.println(result1);
        System.out.println(result2);

        //greater than or equal to:
        boolean result3= 10>=9;
        boolean result4= 100>=100;
        System.out.println(result3); //true
        System.out.println(result4); //true

        //lesser than:
        boolean result5= 5<10;
        boolean result6= 20<8;
        System.out.println(result5); //true
        System.out.println(result6); //false

        //less than or equal:
        boolean result7= 1000<=2000; //true
        boolean result8= 25<=15; //false
        System.out.println(result7);
        System.out.println(result8);

        //equal:
        boolean result9= 10==10;
        boolean result10= 100==200;
        System.out.println(result9); //true
        System.out.println(result10); //false

        //notEqual:
        boolean result11= 1000 !=2000; //true
        boolean result12= 1000 !=1000; //false
        System.out.println(result11);
        System.out.println(result12);

    }


}
