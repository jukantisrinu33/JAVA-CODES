//Fibonacci Number of a number n

public class Recursion_Prob4 {
    public static void main(String args[]) {
        System.out.print(fibonacci(30));
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fibo = fibonacci(n - 1) + fibonacci(n - 2);
        return fibo;
    }
}
