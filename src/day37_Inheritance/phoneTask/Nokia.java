package day37_Inheritance.phoneTask;

public class Nokia extends Phone{
//sets its own instances
    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }
    public void selfDefense(){
        System.out.println("you can use "+brand+" "+ model+" as self defense");
    }
}
