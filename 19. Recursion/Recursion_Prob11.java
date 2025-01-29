//NO repeat String  (side chars)

public class Recursion_Prob11 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Appnnacollege");
        System.out.print(removeDuplicates(sb, sb.length() - 1));
    }

    public static StringBuilder removeDuplicates(StringBuilder sb2, int n) {
        StringBuilder sb = new StringBuilder(sb2);
        if (n < 1) {
            return sb;
        }
        if (sb2.charAt(n) == sb2.charAt(n - 1)) {
            sb.deleteCharAt(n);
        }
        return removeDuplicates(sb, n - 1);
    }
}
