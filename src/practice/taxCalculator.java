package practice;

public class taxCalculator {
    public static void main(String[] args) {

        int salary= 130_000;
        boolean married=true;


        double tax35= (salary- (salary * .35));
        double tax30=(salary-(salary*.30));
        double tax25  =(salary-(salary*.25));
        double tax20  =(salary-(salary*.20));
        double tax15 = (salary-(salary*.15));



        if (salary>=130_000 && married) {
            System.out.println("salary after tax is= " + tax30) ;
        }
            else if (salary>=100&& salary<=129 && married){
                System.out.println("salary after tax is= "+ tax25);
            }

            else if (salary>=80&& salary<=99 && married){
            System.out.println("salary after tax is= "+ tax20);
        }
            else if (salary<=79 && married){
            System.out.println("salary after tax is= "+ tax15) ;
        }
            else if (salary>=130_000 && !married) {
            System.out.println("salary after tax is= " + tax35);

        }
            else if (salary>=100&& salary<=129 && !married){
                System.out.println("salary after tax is= "+ tax30);
            }

            else if (salary>=80&& salary<=99 && !married){
                System.out.println("salary after tax is= "+ tax25);
            }
            else if (salary<=79 && !married){
                System.out.println("salary after tax is= "+ tax20) ;
            }



            else {
            System.out.println ("not valid");

        }
        }


    }

