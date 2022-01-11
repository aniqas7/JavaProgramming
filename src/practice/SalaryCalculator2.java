package practice;

import java.util.Scanner;

public class SalaryCalculator2 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("enter hourly rate");
        double hourlyrate= input.nextDouble();

        System.out.println("weekly hours");
        double hours= input.nextDouble();

        System.out.println("enter state tax in percent");
        double stateTax= input.nextDouble()/100;

        System.out.println("enter federal tax");
        double federalTax= input.nextDouble()/100;

        input.close();
        double salary= (hourlyrate*hours*52);
        double stateTax1= stateTax*salary;
        double federalTax1= federalTax*salary;
        double totalTax= (stateTax1+federalTax1);
        double netIncome=salary-totalTax;

        System.out.println("salary= "+ salary);
        System.out.println("state tax= "+ (stateTax1));
        System.out.println("federal tax= "+ (federalTax1));
        System.out.println("total tax= "+ totalTax);
        System.out.println("net income= "+ netIncome);


        input.close();

    }
}
