//Binomial coefficient of a number nCr =n!/(r!*(n-r)!) 

public class Function_prob2 {
    public static int fact(int n) {
        int factorial = 1;
        if (n < 0) {
            System.out.print("Factoial of Negative Numbers is not possible");
        } else if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
        }
        System.out.println(factorial);
        return factorial;
    }

    public static int Binomial(int n, int r) {
        int factofn = fact(n);
        int factofr = fact(r);
        int factofn_r = fact(n - r);
        return factofn / (factofr * factofn_r);
    }

    public static void main(String args[]) {
        System.out.println(Binomial(4, 4));
    }
}
