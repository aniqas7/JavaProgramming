package practice;

public class CrewAndPassenger {
    public static void main(String[] args) {

        int people=75;
        String label= "";

       if (people ==50 || people==75 || people==100){

           if (people==50){
               label="20 crew, 30 passengers";
           }

           else if (people==75){
               label= "25 crew, 50 passengers";
           }
           else if (people==100){
               label= "30 crew, 70 passengers";
           }
       }
           else {
            label= "invalid";
       }

        System.out.println(label);

    }
}
