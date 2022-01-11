package Arraylistpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class replit {
    //create your method below
public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

    ArrayList<Integer> list1= new ArrayList<>();

    int sum=0;
    for (Integer each : list) {
        if(each>0) {
            list1.add(each);
            sum+=each;
        }

    }list1.add(sum);
    return list1;

}



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }

        System.out.println(appendPosSum(list));

    }
}