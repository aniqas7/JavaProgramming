package ConstructorPractice;

public class carpet {
    public double width, length, unitPrice;
    public boolean isPersian;

    public carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice=width*length*unitPrice;
        if(isPersian){
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
                ", totalPrice="+ calcCost()+
                '}';
    }
}
