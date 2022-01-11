package practice;

import java.util.Scanner;

public class unittest1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte b1 = input.nextByte();
        byte b2 = input.nextByte();

        int max = (b1 > b2) ? b1 + 2 : b2 - 4;
        System.out.println(max);
    }
}
