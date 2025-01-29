//Find n^x (x to the power n) with O(n)

public class Recursion_Prob8 {
    public static void main(String args[]) {
        System.out.print(power(2, 10));
    }

    public static int power(int n, int x) {
        if (x == 1) {
            return n;
        }
        int num = power(n, x - 1);
        num = n * num;
        return num;
    }
}
