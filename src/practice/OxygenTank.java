package practice;

public class OxygenTank {
    public static void main(String[] args) {

        int num= 85;

        if (num>90){
            System.out.println("your tank is full");
        }
        else if (num>80){
            System.out.println("still okay");
        }
        else if(num>70){
            System.out.println("don't go too far");
        }
        else if (num>60){
            System.out.println("start to head back");
        }
        else {
            System.out.println("be careful now you are at 50%");
        }
    }
}
