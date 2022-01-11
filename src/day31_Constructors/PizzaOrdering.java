package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {
        //create 100 pizza objects: size -'S', cheese topping-2, pepperoni topping-3
        //then create 100 more pizza objects: size - 'M',cheese topping-3, pepperoni topping-4
        //create 100 more pizza objects: size-'L', cheese topping -4, pepperoni topping-5

        ArrayList<Pizza>pizzas= new ArrayList<>();

        for (int i = 0; i < 100; i++) {

            Pizza small= new Pizza ('S',2,3);
            //100 pizza objects are created
            Pizza medium=new Pizza ('M',3,4);
            Pizza large= new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(small,medium,large));
        }
        System.out.println("total number of pizzas: "+pizzas.size());
        double totalPrice=0;

        for (Pizza each : pizzas) {
         totalPrice+= each.calcCost(); //price of each pizza
        }
        System.out.println(totalPrice);


    }
}
