//palindrome String

public class Strings_prob1 {
    public static void main(String args[]) {
        String str1 = "racecar";
        boolean m = true;

        for (int i = 0; i < str1.length() / 2; i++) {
            if (str1.charAt(i) != (str1.charAt(str1.length() - i - 1))) {
                m = false;
                break;
            }
        }

        System.out.println(m);

    }
}