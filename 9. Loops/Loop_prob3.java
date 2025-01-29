import java.lang.Math;
import java.util.Scanner;

public class Loop_prob3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number == 2) {
            System.out.print("Number is prime");
        } else if (number % 2 == 0 || number % 5 == 0) {
            System.out.print("Number is not prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.print("Number is prime");
            } else {
                System.out.print("Number is not prime");
            }
        }
        sc.close();
        ;
    }

}
