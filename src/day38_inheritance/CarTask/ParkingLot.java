package day38_inheritance.CarTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota= new Toyota ("Camry",2020,20000,"gray",123456);
        Tesla tesla = new Tesla("Model S", 2022, 94990, "Red", 2482390);
        BMW bmw = new BMW("X5", 2020, 67350, "black", 12000);

   toyota.start();
   tesla.start();
   bmw.start();

    }

}
