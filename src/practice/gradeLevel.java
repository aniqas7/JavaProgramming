package practice;

public class gradeLevel {
    public static void main(String[] args) {

        byte level = 6;
        boolean elementary= 1<=level && level<=5;
        boolean middle= 6<=level && level<=8;
        boolean highSchool= level>=9 && level<=12;
        boolean college= level>=13 && level<=16;
        boolean gradSchool= level>=17 && level<=18;

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
