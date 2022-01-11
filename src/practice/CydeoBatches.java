package practice;

public class CydeoBatches {
    public static void main(String[] args) {
/*
        String batch= "EU";

        if (batch== "US morning" ||
        batch== "US evening" ||
        batch== "EU") {

            if (batch=="US morning"){
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            }
            else if (batch=="US evening"){
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            }
            else {
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F."
                );
            }

        } else {
            System.out.println("invalid batch");
        }
        */
        String batch1= "US evening";

        switch(batch1){

            case "US morning":
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                break;

            case "US evening":
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
                break;

            case "EU":
                System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");

            default:
                System.out.println("batch invalid");
        }
    }
}
