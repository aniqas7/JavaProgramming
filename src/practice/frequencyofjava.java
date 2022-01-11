package practice;

import java.util.Scanner;

public class frequencyofjava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = scan.nextLine();

        int number = 0;

        for (int i = 0; i < str.length(); i++) {
            //java is great java .. 10
            if (str.contains("Java")) {

                str = str.replaceFirst("Java", "");
                number += 1;
            }

        }
        System.out.println(number);

        scan.close();
    }
}
