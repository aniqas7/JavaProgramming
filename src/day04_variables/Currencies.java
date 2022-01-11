package day04_variables;

public class Currencies {

    public static void main(String[] args) {
//convert $1000 to other currencies

        int dollar=1000;
        double dollars= 1.00;
        double lira= 9.53;
        double euro= 0.86;
        double jpy= 114.14;
        double peso= 20.86;
        double CAD=  1.24;

        double LiraConversion= dollar * lira;
        double EuroConversion= dollar*euro;
        double jpyConversion= dollar*jpy;
        double cadConversion= dollar*CAD;

        System.out.println(LiraConversion);
        System.out.println(EuroConversion);
        System.out.println(jpyConversion);
        System.out.println(cadConversion);









    }
}
