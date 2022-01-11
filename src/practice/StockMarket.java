package practice;

import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int sharesowned;
        double value = 0;
        String name = null;

        System.out.println("total shares currently owned: ");
        sharesowned = input.nextInt();

            if (sharesowned > 0) {
                System.out.println("");

                System.out.println("total value in stock market");
                 value = input.nextDouble();
                input.nextLine();

                System.out.println("enter name of company they have most shares in: ");
                name = input.nextLine();

            }


        System.out.println("your total stock market holding is " + value + ", which is made up of " + sharesowned+ " shares. " + name + " is your companys holdings.");

input.close();
    }
}

