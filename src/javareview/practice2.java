package javareview;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1=scan.nextInt();

        int num2=scan.nextInt();

       int count=0;
        for (int i = num1; i >=0; i--) {
            int result = num1 - num2;
            count++;
            num1=result;
            if (result == 0) {
                break;
            }
        }
        System.out.println(count);
    }
}
