package custommethodsarraypractice;

import java.util.Arrays;
import java.util.Scanner;
public class replitarrayfirstandlastchar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] arr = str.split(", ");
        String min = "";

        int shortest = arr[0].length();

        for (int i = 0; i < arr.length; i++) {
            if (shortest > arr[i].length()) {
                shortest = arr[i].length();
            }
        }
        for (String each : arr) {
            if (each.length() == shortest) {
                min += each + ", ";

            }
        }
        String[] array1 = min.split(", ");
         Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

    }
}