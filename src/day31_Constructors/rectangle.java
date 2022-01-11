package day31_Constructors;

public class rectangle {

        public double length, width;

    public rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calcArea(){
        return length*width;
    }

    public double calcPerimeter(){
        return 2*(length+width);
    }

    public String toString() {
        return "rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area="+calcArea()+
                ", perimeter"+calcPerimeter()+
                '}';
    }
}
