package day41_exceptions.Car;

public class Honda extends Car{
    public Honda(String model, String color, int year, double price) {
        super("Honda", model,color, year, price);
    }
    public void start(){
        System.out.println("turn key to start car");
    }
    public void stop(){
        System.out.println("brake");
    }

}
