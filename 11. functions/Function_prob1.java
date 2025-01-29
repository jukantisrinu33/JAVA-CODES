
//factroial of a number

public class Function_prob1 {
    public static int fact(int n) {
        int factorial = 1;
        if (n < 0) {
            System.out.print("Factoial of Negative Numbers is not possible");
        } else if (n == 0) {
            System.out.print("Factorial = 1");
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        System.out.println(factorial);
        return factorial;
    }

    public static void main(String args[]) {

        System.out.println(fact(5));
    }
}