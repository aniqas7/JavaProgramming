package practice;

public class CampusTime {
    public static void main(String[] args) {

        int time=7;
        String amORpm= "PM";



        if(time>=1&& time<=24) {

            if (time >= 1 && time <= 8 && amORpm=="AM"){
                System.out.println("campus is open!");
             }
            else  {

                System.out.println("campus is closed.");

            }
        }
        else {
            System.out.println("invalid");


        }
    }
}
