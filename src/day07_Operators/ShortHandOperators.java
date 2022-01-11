package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
        
        //assignment=
        //updates data that variable contains
        //ex int number= 100
        //       number = 50
        //variables' new value is 50
        int number = 100;

        System.out.println("number = " + number);
        
       //int number = 200;
        //would result in compile error bc it would be a new variable
        
        number = 200;
        //doesn't result in an error bc it is the same variable, value changing
        
        String word= "Java Programming";

        System.out.println("word = " + word);

        word = "Wooden Spoon";

        System.out.println("word = " + word);

        //Addition Assignment:

        int x=100;

        System.out.println(x);

        System.out.println(x+200);
        //we get 300, but it doesn't change value of x. we want x = 300

        x= x+200;
        System.out.println("x = " + x);

        //shortcut

        x +=200;
        System.out.println("x = " + x);

        String str= "Wooden";

        str +=" Spoon";

        System.out.println("str = " + str);

        double num1=2.5;
        System.out.println("num1 = " + num1);

        num1 +=5.5;

        System.out.println("num1 = " + num1);

        double availableBalance = 100.50;
                availableBalance= 1000.50;

        //deposit 300$ into the account ==400.50

        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance);


        //withdrawing $500

        availableBalance -=500;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$, then depositing $400

        availableBalance -=200; //600.5
        availableBalance +=400; //1000.5

        System.out.println("availableBalance = " + availableBalance);

        double salary = 50000.50;
        //after graduating salary doubles, what is expected salary?

        System.out.println("salary = " + salary);
        salary *=2; //salary= salary*2;

        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("doge = " + doge);

        double num2 =25000;
        num2 /=2;
        System.out.println("num2 = " + num2);

        //remainder % when u want to assign remainder to variable

        double num3= 100;

        num3 %=3;
        System.out.println("num3 = " + num3);

        int amount = 127; //cents
        //how many quarters to return
        int quarters= amount/25;
        int cents= amount % 25;
        System.out.println("cents = " + cents);
        //cents = 2
        cents %=25;

        int y = 300;
        //remainder of 300/16, assign it back to y

        y%=16;

        System.out.println("y = " + y);

        int balance = 3500;
        //insurance fee: $153

        balance %=153;
        System.out.println("balance = " + balance);

        int areaCode1= 222;
        int localNumber1= 3334444;

        int phoneNumber1= areaCode1+ localNumber1;









    }

}
