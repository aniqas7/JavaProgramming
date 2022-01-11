package practice;

import java.util.Arrays;

public class itemspricesids {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        boolean hasipad=false;
        String report="";
        for (int i = 0; i < items.length-1; i++) {
            String itemName=items[i];
            double itemPrice=prices[i];
            int itemID=itemIDs[i];

            if(itemName.equals("Gloves")){
                System.out.println(i);
            }

            if(hasipad==true){
            System.out.println("true");}

            report+=itemName+"-"+itemPrice+"-#"+itemID+"\n";

        }

        System.out.println(report);

    }
}
