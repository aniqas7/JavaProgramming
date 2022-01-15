package day38_inheritance.CarTask;

public class Tesla extends Car {

    public Tesla( String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }
    public void autoPilot(){
        System.out.println(brand+ " "+ model+ " has autopilot" );
    }

   // public void start(){
    //    System.out.println(brand+" "+model+" is automatic");
    //}


    @Override
    public void start() {
        System.out.println("Say\"Start\"+to start "+brand+" "+model);
    }
}
