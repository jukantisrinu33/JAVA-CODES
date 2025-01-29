public class Function_prob13 {

    public static void diamond(int n) {
        int counter6 = n / 2;
        for (int i = 1; i <= n; i++) {
            int counter1 = n / 2;
            int counter2 = n / 2 - i;
            int counter3 = i + i - 1;
            int counter4 = 1;
            if (i <= n / 2) {
                for (int j = 1; j <= n; j++) {
                    if (counter1 == j) {
                        System.out.print("* ");
                        counter4++;
                    } else if (counter2 >= j) {
                        System.out.print("  ");
                    } else if (counter4 <= counter3) {
                        System.out.print("* ");
                        counter4++;
                    }
                }
                System.out.println();
            } else {
                int counter5 = i - (n / 2 + 1);
                int counter7 = n - i + counter6;
                for (int j = 1; j <= n - 1; j++) {
                    if (counter5 >= j) {
                        System.out.print("  ");
                    } else if (counter7 > 0) {
                        System.out.print("* ");
                        counter7--;
                    }
                }
                counter6--;
                System.out.println();

            }
        }
    }

    public static void main(String args[]) {
        diamond(30);
    }
}
