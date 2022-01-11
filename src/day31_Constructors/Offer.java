package day31_Constructors;

public class Offer {

    public String location;
    public String companyName;
    public String jobTitle;
    public double salary;
    public boolean hasBenefit, hasPTO, isWFH,isFullTime ;

    public void setInfo(String location, String companyName, String jobTitle, double salary, boolean hasBenefit, boolean hasPTO, boolean isFullTime, boolean isWFH ) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit=hasBenefit;
        this.hasPTO=hasPTO;
        this.isWFH=isWFH;
        this.isFullTime=isFullTime;

    }

    public String toString() {
        return "Constructors{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", isFullTime=" + isFullTime +
                '}';
    }
    /*
1. Create a custom class named Offer
        Attributes:
                location, companyName, jobTitle, salary, hasBenefit, hasPTO, isWFH, isFullTime
        Actions:
            setInfo(): sets all the instance variables
            toString(): returns the full info of the Offer Object
 */

}
