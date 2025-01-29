public class Oops_Prob1 {

    public static void main(String args[]) {
        Complex c = new Complex();
        System.out.println(c.sum(1, 2, -2, -4) + "i");
        System.out.println(c.sub(1, 2, -2, -4) + "i");
        System.out.print(c.Multi(1, 2, -2, -4) + "i");
    }

}

class Complex {
    String sum(int a, int a_complex, int b, int b_complex) {
        if ((a_complex + b_complex) >= 0) {
            return (a + b) + "+" + (a_complex + b_complex);
        } else {
            return (a + b) + "" + (a_complex + b_complex);
        }

    }

    String sub(int a, int a_complex, int b, int b_complex) {
        if ((a_complex - b_complex) >= 0) {
            return (a - b) + "+" + (a_complex - b_complex);
        } else {
            return (a - b) + "" + (a_complex - b_complex);
        }
    }

    String Multi(int a, int a_complex, int b, int b_complex) {
        if ((a * b_complex + a_complex * b) >= 0) {
            return (a * b) - (a_complex * b_complex) + "+" + (a * b_complex + a_complex * b);
        } else {
            return (a * b) - (a_complex * b_complex) + "" + (a * b_complex + a_complex * b);
        }

    }

}
