package practice;

public class replitGreaterNumber {

            public static void main(String[] args) {

                //WRITE YOUR CODE HERE:

                int age=1;

                if (age>2&&age<18) {


                    if(age==2){
                        System.out.println("toddler");
                    }

                    else if (age==3  || age==4 || age==5  ){
                    System.out.println("early childhood");}

                   else if (age==6 || age==7) {
                    System.out.println("young reader");

                } else if (age==8  || age==9 || age==10  ){
                    System.out.println("elementary");

                } else if (age==11  || age==12 ){
                    System.out.println("middle");
                }
                else if (age==13){
                    System.out.println("impossible");
                }
                else if (age==14 || age==15 || age==16  ){
                    System.out.println("high school");

                } else {
                    System.out.println("scholar");
                }
            } else {
                System.out.println("ineligible");
            }



        }
    }







