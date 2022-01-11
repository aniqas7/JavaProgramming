package methodsoverloadingpractice;

import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {
        int[] array1={1,2,3,4,5};
        double[]array2= {1,2,3,4,5};
        char[] chars = {'A', 'B', 'C', 'D'};
        String[] names1 = {"Ahmet", "Oleksandr", "Sinem", "Cihad"};

       int[] finalresult= array(array1);
        System.out.println(Arrays.toString(finalresult));
       double[] finalresult1= array(array2);
        System.out.println(Arrays.toString(finalresult1));
        char[] finalresult2= array(chars);
        System.out.println(Arrays.toString(finalresult2));
        String[] finalresult3= array(names1);
        System.out.println(Arrays.toString(finalresult3));
    }
    public static int[]array(int[] arr){

        int[] result= new int[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {

            result[j]=arr[i];

        } return result;
    }
    public static double[]array(double[] arr){

        double[] result= new double[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {

            result[j]=arr[i];

        } return result;
    }

    public static char[]array(char[] arr){

        char[] result= new char[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {

            result[j]=arr[i];

        } return result;
    }
    public static String[]array(String[] arr){

       String[] result= new String[arr.length];
        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {

            result[j]=arr[i];

        } return result;
    }
}
