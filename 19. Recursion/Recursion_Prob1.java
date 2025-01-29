//Printing numbers in Increasing order

public class Recursion_Prob1 {

    public static void main(String args[]) {
        Incre(5);

    }

    public static void Incre(int n) {

        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        Incre(n - 1);
        System.out.print(n + " ");

    }

}