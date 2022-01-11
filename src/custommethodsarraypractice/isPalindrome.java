package custommethodsarraypractice;

public class isPalindrome {
    public static void main(String[] args) {


        String str1 = "laal";
        boolean result1 = isPalindrome(str1);
        System.out.println(result1);
    }

    public static boolean isPalindrome(String str1) {
        boolean result = false;
        String result1 = "";

        for (int i = str1.length ()-1; i >= 0; i--) {
            result1 += str1.charAt(i);

        }
        System.out.println(result1);
        if (result1.equals(str1)) {
            result = true;

        }else{
            result=false;
        } return result;
    }
}

    /*
        if ((Arrays.equals(ch1, ch2))) {
        result = true;
        } else {
        result = false;
        }return result;
        }
        }

     */

