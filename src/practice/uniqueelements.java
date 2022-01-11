package practice;

public class uniqueelements {
    public static void main(String[] args) {
        //unique elements of array

        int []array={1,2,3,3,4,4,1};

        for (int i = 0; i <array.length ; i++) {
            int frequency = array(array, array[i]);
            if (frequency == 1) {
                System.out.println(array[i]);
            }
        }

    }

    public static int array(int []array, int num) {

        int count = 0;
        for (int each : array) {

            if (each == num) {
                count++;
            }

        }
        return count;

    }

    }
