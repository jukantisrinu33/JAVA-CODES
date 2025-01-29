
//find and print all the subsets of a given strings

public class BTC_Prob2 {
    public static void main(String args[]) {

        String str = "abc";
        subsets(str, "", 0);

    }

    public static void subsets(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.println(ans);
            return;
        }

        // no Choice
        subsets(str, ans, i + 1);

        // Yes choice
        ans = ans + str.charAt(i);
        subsets(str, ans, i + 1);

    }

}
