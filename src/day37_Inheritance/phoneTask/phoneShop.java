package day37_Inheritance.phoneTask;

public class phoneShop {
    public static void main(String[] args) {
//creating objects
        Iphone iphone=new Iphone("Iphone 12","6.7 in",1000,"black");
        Samsung samsung=new Samsung("Galaxy s19","6 in",900,"White");
        Nokia nokia= new Nokia ("Brick","4 in",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(110);
        iphone.text(1234567);
        iphone.faceTime(89101);;
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("---------------");
        samsung.call(110);
        samsung.text(12345);
        samsung.freeze();

        System.out.println("---------------");
        nokia.call(110);
        nokia.text(123124214);
        nokia.selfDefense();


    }
}
