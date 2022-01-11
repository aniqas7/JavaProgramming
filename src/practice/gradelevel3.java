package practice;

public class gradelevel3 {

        public static void main(String[] args) {

            byte level = 16;
            boolean elementary= 1<=level && level<=5;
            boolean middle=  level<=8;
            boolean highSchool= level<=12;
            boolean college=  level<=16;
            boolean gradSchool= level<=18;

            if(elementary){
                System.out.println("elementary");
            }
            else if (middle){
                System.out.println("middle");
            }
            else if(highSchool){
                System.out.println("high school");
            }
            else if(college){
                System.out.println("college");
            }
            else{
                System.out.println("grad school");
            }











        }
    }


