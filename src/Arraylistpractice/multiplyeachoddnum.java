package Arraylistpractice;

import java.util.ArrayList;

public class multiplyeachoddnum {
    public static void main(String[] args) {
        /*
        3. write a program that can multiply each odd number by 2
	            ex: list = [1,2,3,4,5];
	                output: [2,2,6,4,10]

         */

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (Integer each : numbers) {

            if(!(each%2==0)){
               Integer result= each*2;
               numbers.set(numbers.indexOf(each),result);

            }

        }
        System.out.println(numbers);
    }
}
