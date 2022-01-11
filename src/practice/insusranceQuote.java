package practice;

import java.util.Locale;
import java.util.Scanner;

public class insusranceQuote {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();

        System.out.println("enter gender:");
        char gender= scan.next().toLowerCase().charAt(0);

        while(!(gender=='f'||gender=='m')){
            System.out.println("invalid entry. please reenter gender");
            gender=scan.next().toLowerCase().charAt(0);
        }
        System.out.println("are you married?");
        String married= scan.next();
       while(!(married.equals("yes")||married.equals("no"))){
            System.out.println("invalid entry. please reenter if you are married");
            married=scan.next();
        }
        System.out.println("enter your age:");
        int age=scan.nextInt();

        while(!(age>0&&age<120)){
            System.out.println("invalid entry. please reenter age");
            age=scan.nextInt();
        }
        System.out.println("how many miles do you drive a day?");
        int miles=scan.nextInt();

       while(!(miles>5)){
            System.out.println("invalid entry, please reenter miles");
        miles= scan.nextInt();}
       scan.nextLine();

        System.out.println("do you want full coverage or liability insurance");
        String insurance=scan.nextLine();

        while(!(insurance.equals("full coverage")||insurance.equals("liability"))) {
            System.out.println("invalid entry, please reenter if you have any claims");
            insurance = scan.nextLine();
        }

        System.out.println("any accidents or claims in past 5 years? yes/no");
        String claims=scan.next();

        while(!(claims.equals("yes")||claims.equals("no"))){
            System.out.println("invalid entry, please reenter if you have any claims");
            claims=scan.next();
        }
        System.out.println("any antitheft device? yes or no");
        String antitheft=scan.next();

       while(!(antitheft.equals("yes")||antitheft.equals("no"))) {
            System.out.println("invalid entry, please reenter if you antitheft devices");
            antitheft=scan.next();
       }
        //insurance quote calculation
        double price=0;
        //liability
        if(insurance.equals("liability")) {
            if (age < 25) {
              price+=90;
            } else {
                price+=50;
            }


            if (miles <= 10) {
                price+=10;
            } else if (miles > 10 && miles <= 50) {
                price+=30;
            } else {
                price+=10;
            }
        }

        //full coverage

           else{
                if (age < 25) {
                   price+=160;
                } else {
                   price+=120;
                }

                if (miles <= 10) {
                  price+=20;
                } else if (miles > 10 && miles <= 50) {
                   price+=40;
                } else {
                   price+=70;
                }
            }

           double discountrate=0;
        if(antitheft.equals("yes")){
            discountrate += .05;
        }
        if(claims.equals("yes")){
            discountrate-=.15;
        }
        if(!(claims.equals("yes"))){
            discountrate+= .10;
        }
        if(married.equals("yes")){
            discountrate+=.05;
        }

        double totalPrice=price- (price*discountrate);
        System.out.println(totalPrice);
    }
}
