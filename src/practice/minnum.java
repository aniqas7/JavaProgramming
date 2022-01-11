package practice;

public class minnum {
    public static void main(String[] args) {

        int[] array= {1,3,2,4};

        int result= min(array);
        System.out.println(result);
    }

    public static int min (int[] array){

        int min=array[0];
        for (int each: array) {

            if(min>each){
                min=each;
            }

        } return min;


    }
}
