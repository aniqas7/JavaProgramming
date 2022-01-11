package methodsoverloadingpractice;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[]arr1={1,2,3,4,5};
        int[]arr2={6,7,8,9,10};
      int[]result =merge(arr1,arr2);
        System.out.println(Arrays.toString(result));

       char[] chars = {'A', 'B', 'C', 'D'};
       char[] chars2={'D', 'E', 'F', 'G'};
       char[] result1=merge(chars,chars2);
       System.out.println(Arrays.toString(result1));

        String[] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"};
        String[] names2 = {"Lauren", "Mia", "Aniqa", "Madihah"};
        String[] result3= merge(names, names2);
        System.out.println(Arrays.toString(result3));
    }

    public static int[] merge(int[] arr1, int[] arr2){
      int[]arr3=new int[arr1.length+arr2.length];
      int j=0;
        for (int each : arr1) {
            arr3[j++]=each;
        }
        for(int each: arr2){
            arr3[j++]= each;
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2){
        double[]arr3=new double[arr1.length+arr2.length];
        int j=0;
        for (double each : arr1) {
            arr3[j++]=each;
        }
        for(double each: arr2){
            arr3[j++]= each;
        }
        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2){
        char[]arr3=new char[arr1.length+arr2.length];
        int j=0;
        for (char each : arr1) {
            arr3[j++]=each;
        }
        for(char each: arr2){
            arr3[j++]= each;
        } return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2){
        String[]arr3=new String[arr1.length+arr2.length];
        int j=0;
        for (String each : arr1) {
            arr3[j++]=each;
        }
        for(String each: arr2){
            arr3[j++]= each;
        } return arr3;

    }

   // public static String[] merge(String[] arr1, String[] arr2 ){

   // }

}


