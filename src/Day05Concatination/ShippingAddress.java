package Day05Concatination;

public class ShippingAddress {

    public static void main(String[] args) {

        String name= "Aniqa Siddiqi";
        int buildingNumber= 47772;
        String streetName= "Saulty Dr.";
        String city= "Sterling";
        String state= "Virginia";
        int zipCode= 20165;
        String address= (name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + "\n" + zipCode);

        System.out.println(name + "\n" + buildingNumber + " " + streetName + "\n" + city + ", " + state + "\n" + zipCode);

        //or

        String name1= "Aniqa Siddiqi",
                buildingName1="47772",
                streetName1="Saulty Dr.",
                city1="Sterling",
                state1="Virginia";
        int zipCode1= 20165;

        System.out.println(name1 + "\n" + buildingName1);
        System.out.println(address); //any concatination can be assigned to variable so it is faster


    }
}
