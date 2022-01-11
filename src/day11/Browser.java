package day11;

public class Browser {
    public static void main(String[] args) {

        String browser = "edge";

        if (browser=="chrome" || browser=="firefox" || browser== "opera"
        || browser== "safari" || browser== "edge")
        {

            if (browser == "chrome") {
                System.out.println("Chrome Browser is selected");
            } else if (browser == "firefox") {
                System.out.println("firefox is selected");
            } else if (browser == "opera") {
                System.out.println("opera is selected");
            } else if (browser == "chrome") {
                System.out.println("safari is selected");
            } else {
                System.out.println("edge is selected");
            }

        } else {
            System.out.println("invalid browser name");
        }

  /* 1. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if

   */





    }
}
