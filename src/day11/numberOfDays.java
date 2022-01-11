package day11;

public class numberOfDays {
    public static void main(String[] args) {

        int n= 13;
        String days= "";

        switch (n){

            case 1: case 3: case 5: case 7: case 10: case 12:
                days="31 days";
                break;

            case 2:
                days= "28 days";
                break;

            case 4: case 6: case 9: case 11:
                days= "30 days";
                break;

            default:
                days= "Invalid";

        }
        System.out.println(days);
    }
}
