package practice;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class exam {
    public static void main(String[] args) {
        dosum(10, 20);
        dosum(10.0, 20.0);

    }

    public static void dosum(double x, double y) {
        System.out.println("double sum" + (x + y));
    }

    public static void dosum(float x, float y) {
        System.out.println("float sum" + (x + y));

    }

    public static void dosum(int x, int y) {
        System.out.println("float sum" + (x + y));

    }
}


