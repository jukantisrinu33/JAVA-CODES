//NO repeat String  only for small cases

public class Recursion_Prob12 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder();
        boolean array[] = new boolean[26];
        norepeat("doneo", 0, sb, array);
    }

    public static void norepeat(String str, int n, StringBuilder sb, boolean array[]) {
        if (n == str.length() - 1) {
            System.out.print(sb);
            return;
        }
        int index = str.charAt(n);
        if (array[index - 97] != true) {
            sb.append(str.charAt(n));
            array[index - 97] = true;
        }
        norepeat(str, n + 1, sb, array);

    }

}
