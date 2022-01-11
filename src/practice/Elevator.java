package practice;

public class Elevator {
    public static void main(String[] args) {

        int floornumber = 1;

        if (floornumber == 1) {
            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks ");
        }
        else if (floornumber==2){
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        }
        else if (floornumber==3){
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house"
            );
        }
     else{
        System.out.println("invalid floor number");

            System.out.println("-------------------");
            //switch

            int floornumber1= 2;

            switch (floornumber){
                case 1:
                    System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
                    break;

                case 2:
                    System.out.println("Floor2 selected. Companies: Cybertek, NASA, Intelsat");
                    break;

                case 3:
                    System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
                    break;

                default:
                    System.out.println("invalid phone number");
            }





    }
    }
}
