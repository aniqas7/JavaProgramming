package day37_Inheritance.phoneTask;

public class Iphone extends Phone{

    //don't need brand of iphone in constructor
    //all iphone brand is apple so don't need in constructor
    //setting instances of iphone constructor
    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);

    }

    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" "+"is FT phone number"+ phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" "+"is FT phone number"+ email);
    }
}
