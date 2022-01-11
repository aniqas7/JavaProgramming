package practice;

public class StatusCode {
    public static void main(String[] args) {

        int number = 503;

        String http= (number == 200) ? "ok" : (number == 201) ? "created" : (number == 202) ? "accepted"
                : (number == 301) ? "accepted" : (number == 303)? "see other":(number == 304)?
                "not modified" : (number==307)? "temporary redirect" :(number==400)? "bad request"
                : (number==401)? "unauthorized" : (number==403)? "forbidden" : (number==404)?
                "not found" :(number==410)? "gone" : (number==500)? "internal server error"
                : "service unavailable";
        System.out.println(http);
    }
}
