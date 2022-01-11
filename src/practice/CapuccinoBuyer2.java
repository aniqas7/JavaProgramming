package practice;

public class CapuccinoBuyer2 {
    public static void main(String[] args) {
        String size= "tall";

        switch(size){

            case "tall":
                System.out.println("price is $3.69 \n90 calories");
                break;

            case "grande":
                System.out.println("price is $3.99 \n120 calories");
                break;

            case "venti":
                System.out.println("price is $4.29 \n150 calories");
                 break;

            default:
                System.out.println("invalid size");

        }
    }
}
