////Find X^n (x to the power n) with O(logn)

public class Recursion_Prob9 {
    public static void main(String args[]) {
        System.out.print(power(2, 10));
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = power(x, n / 2);
        int halfpowersquare = halfpower * halfpower;
        if (n % 2 != 0) {
            halfpowersquare = x * halfpowersquare;
        }
        return halfpowersquare;
    }
}
