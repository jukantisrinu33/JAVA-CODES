//Factorial

public class Recursion_Prob2 {

    public static void main(String args[]) {
        System.out.print(factorial(5));
    }

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        int val = factorial(n - 1);
        val = n * val;
        return val;

    }
}
