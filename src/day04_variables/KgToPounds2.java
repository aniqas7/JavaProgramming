package day04_variables;

public class KgToPounds2 {

    //convert kg (int) to pounds (double)
    //1kg =2.2lb

    public static void main(String[] args) {
        int kg = 5;
        double lb = 2.2;
        double kgtolb = kg * lb;

        System.out.println(kgtolb);

        //circle perimeter and area

        double radius = 5.5;
        double pi = 3.142;
        double circle_perimeter = 2 * pi * radius;
        double circle_area = pi * radius * radius;

        System.out.println("circle_area = " + circle_area);
        System.out.println("circle_perimeter = " + circle_perimeter);

    }
}
