package day20_forEach;

public class initials {
    public static void main(String[] args) {
        String[] names = {"Elminur Ablimit", "Ali Kilic", "Hulya Keles", "Simen Kaya", "Begench Begenjov", "Ruveyda Durna",
                "Jonathan Holly", "Alshaun Rodgers", "Manas Kalenov", "Gulsen Sohret"};


        for(String each : names ){
            String initial = each.charAt(0)+"."+ each.charAt(  each.indexOf(" ") +1   );
            System.out.println(initial);
        }

        for (int i = 0; i < names.length; i++) {
            String initial = names[i].charAt(0)+"."+ names[i].charAt( names[i].indexOf(" ") +1   );
            System.out.println(initial);


        }
    }
}
