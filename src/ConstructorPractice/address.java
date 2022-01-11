package ConstructorPractice;

public class address {
    public int buildingNumber, zipcode;
    public String street, city, state;

    public address(int buildingNumber, int zipcode, String street, String city, String state) {
        this.buildingNumber = buildingNumber;
        this.zipcode = zipcode;
        this.street = street;
        this.city = city;
        this.state = state;
    }


    public String toString() {
        return
               buildingNumber + " " + street + "\n" + city + " " + state+" "
                +zipcode;

    }
}
