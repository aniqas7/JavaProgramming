package day30_CustomClass;

public class Car {
//instances , instance variables
    //5 attributes
    public String brand;
    public String model;
    public String color;
    public int year;
    public double price;

    public Car(String toyota) {
    }

    public Car() {

    }

    //3 actions?
    //setinfo method
    //these are the arguments we are getting from the user
    public void setInfo(String carBrand, String carModel, String carColor, int carYear, double carPrice) {
        brand = carBrand;
        model= carModel;
        color= carColor;
        year= carYear;
        price= carPrice;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price= $" + price +
                '}';
    }
//these are methods we can call once we have objects
    public void drive() {
        System.out.println("Driving " + brand + " " + model);
    }
        public void start(){
            System.out.println(brand+" "+model+ "has started");
        }

        public void stop(){
            System.out.println(brand+ " "+model+ "has stopped");
        }


    }
