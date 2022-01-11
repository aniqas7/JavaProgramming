package practice;

public class capuccinoBuyer3 {
    public static void main(String[] args) {

        String name= "venti";

        if (name=="tall" || name=="grande" || name=="venti") {

            switch (name) {
                case "tall":
                    System.out.println("price is $3.69 \n90 calories");
                    break;

                case "grande":
                    System.out.println("price is \n calories");
                    break;

                default:
                    System.out.println("price is \n calories");


            }
        } else {
            System.out.println("size is invalid");
        }

        }
}
