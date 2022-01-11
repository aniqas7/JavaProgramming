package practice;

public class CappucinoBuyer {
    public static void main(String[] args) {

        String Size= "tall";


        if (Size=="tall" || Size== "grande" || Size=="venti"){

            if (Size=="tall"){
                System.out.println("tall : price is 3.69" + "\n90 calories");
            }
            else if (Size=="grande"){
                System.out.println("grande: price is 3.99" + "\n120 calories ");
            }
            else {
                System.out.println("venti: price is $4.29" + "\n150 calories");
            }

        }
        else {
            System.out.println("invalid size");
        }
    }
}
