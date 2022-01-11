package day37_Inheritance.phoneTask;

public class Phone { //parent class: only contains the common features of all the subclass
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery=true; //no need for static block bc we know its one step

    //constructor will not be inherited
    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public void call(long phoneNumber){
        System.out.println(brand+" "+model+"is calling");
    }
    public void text(long phoneNumber){
        System.out.println(brand+" "+model+"is texting");
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color='" + color + '\'' +
                ", hasbattery='"+hasBattery+
                '}';
    }
}
