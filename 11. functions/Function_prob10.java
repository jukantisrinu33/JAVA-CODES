import java.util.Scanner;

public class Function_prob10 {

    public static void butterfly(int n) {

        for (int i = 1; i <= n; i++) {
            int counter1 = i;
            int counter2 = n - i;
            if (i <= n / 2) {
                for (int j = 1; j <= n / 2; j++) {
                    if (counter1 >= j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                for (int j = (n / 2) + 1; j <= n; j++) {
                    if (counter2 < j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            } else {
                int counter3 = n - i + 1;
                int counter4 = i;
                for (int j = 1; j <= (n / 2); j++) {
                    if (counter3 >= j) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                for (int j = (n / 2) + 1; j <= n; j++) {
                    if (j >= counter4) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();
        if (num % 2 == 0 && num > 3) {
            butterfly(num);
        } else {
            System.out.print("Butterfly Cant form");
        }
        sc.close();

    }
}
