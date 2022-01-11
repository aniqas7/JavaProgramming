package practice;

public class sumofodd {
    public static void main(String[] args) {

        int sumodd=0;

        for (int i = 0; i < 100; i++) {

            if(!(i%2==0)){
                sumodd+= i;
            }
        }
        System.out.println(sumodd);
    }
}
