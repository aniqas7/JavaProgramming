package custommethodsarraypractice;

import java.util.Arrays;

public class contains<result> {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        boolean arraycontains = contains(array, 5);
        System.out.println(arraycontains);

    }

    public static boolean contains(int[] array1, int num) {
        boolean result = false;
        int count = 0;
        for (int each : array1) {

            if (each == num) {
                count++;
            }
            if (count >= 1) {
                result = true;
            } else {
                result = false;

            }
        }
        return result;
    }
}
                /*
                9. Create a method named contains that passes one integer array and one integer parameters, the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false

                 */



