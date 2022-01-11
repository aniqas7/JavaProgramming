package practice;

public class SalaryCalculator {

    public static void main(String[] args) {

        int hourlyRate= 50;
        int weeklyHours= 45;
        double stateTax= .06;
        double federalTax= .26;

        //salaryBeforeTax

        double salaryBeforeTax= hourlyRate*weeklyHours*52;
        System.out.println("Salary before tax = $" + salaryBeforeTax);

            //salary before tax = 117000.0

        //totalTax

        double tax1= salaryBeforeTax*stateTax;
        double tax2= salaryBeforeTax*federalTax;
        double totalTax= tax1+tax2;
        System.out.println("totalTax = $" + tax1 + tax2);
            //totalTax=7020.03

        //salaryAfterTax
        double salaryAfterTax= salaryBeforeTax- totalTax;
        System.out.println("salaryAfterTax = " + salaryAfterTax);

            //salaryAfterTax= 79560







    }
}
