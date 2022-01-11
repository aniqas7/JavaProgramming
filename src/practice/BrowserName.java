package practice;

public class BrowserName {
    public static void main(String[] args) {
        String  name= "Chrome";

        switch (name) {
            case "Chrome":
                System.out.println("chrome");
                break;

            case "firefox":
                System.out.println("firefox");
                break;

            case "opera":
                System.out.println("opera");
                break;

            case "safari":
                System.out.println("safari");
                break;

            case "edge":
                System.out.println("edge");
                break;

            default:
                System.out.println("invalid browser");
        }
    }
}
