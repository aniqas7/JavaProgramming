package day20_arrays;

import java.util.Arrays;

public class arraysintro {
    public static void main(String[] args) {

        //create a variable that's capable enough to contain 5 names
        String[] myGroup =new String[5];
        System.out.println(Arrays.toString(myGroup));
        //print Gunay, Neira, Suat, Hulya, Mikael
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        String[] days= {"Monday", "Tuesday","Wednesday","Thursday","Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        int number=5;
        if(number<1||number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


    }
}
