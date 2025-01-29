//sum of n natural numbers

public class Recursion_Prob3 {
    public static void main(String args[]) {
        System.out.print(sum(3));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int val = sum(n - 1);
        val = n + val;
        return val;

    }
}
