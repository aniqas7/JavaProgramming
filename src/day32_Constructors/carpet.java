package day32_Constructors;

public class carpet {
    public double width, length, unitPrice;
    public boolean isPersian;
    //constructor created to set 4 instances
    public carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
        //instance vs static method. no static specifier for instance method

        public double calcCost() {
        double totalPrice= (width*length)*unitPrice;
        if(isPersian){//only executed if true
            totalPrice+=200;
        }
        return totalPrice;
        }

    public String toString() {
        return "carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price="+ calcCost()+
                '}';
    }
}
