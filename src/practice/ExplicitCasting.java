package practice;

public class ExplicitCasting {
    //casting larger prmitive types to smaller primitive types must be done explicitly
    /*
    double x= 20.5;
    int y = x;
    will yield an error bc you can't assign the larger prim type (doube/x) to smaller prim type
    (int/y)
     */

    public static void main(String[] args) {

        double x=20.5;
        int y= (int)x;

        System.out.println(x);
        System.out.println(y);




    }
}
