package day32_Constructors;

public class hi {
    public hi(){
        System.out.println("A");

    }
    public hi(int a){
        this(2.5);
        System.out.println("B");

    }
    public hi(double c){
        this();
        System.out.println("c");

    }

    public static void main(String[] args) {
        Test obj= new Test(100);
    }
}
