package ConstructorPractice;

public class salary {
   public int hourlyRate;
   public double stateTaxRate;
   public double federalTaxRate;
   public int weeklyHours;

   public salary(int hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
      this.hourlyRate = hourlyRate;
      this.stateTaxRate = stateTaxRate;
      this.federalTaxRate = federalTaxRate;
      this.weeklyHours = weeklyHours;
   }

   public double salary(){
      double salary=hourlyRate*weeklyHours*52;
      System.out.println("salary is:$"+salary);
      return salary;
   }
   public double stateTax(){
      double stateTax= stateTaxRate*salary()/100;
      return stateTax;
   }

   public double federalTax(){
      double federalTax=federalTaxRate*salary()/100;
      return federalTax;
   }
   public double salaryAfterTax(){
      double salaryAfterTax=salary()-(stateTax()+federalTax());
      return salaryAfterTax;
   }


   public String toString() {
      return "salaryCalculator{" +
              "salary" + salary() +
              ", stateTax=" + stateTax() +
              ", federalTax=" + federalTax() +
              ", salary after tax=" + salaryAfterTax()+
              '}';
   }
}

