//  (0 1) traingle pattern

public class Function_prob9 {

    public static void floydsTriangle(int num) {
        int Tracker = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    Tracker = 0;
                } else {
                    Tracker = 1;
                }

                if (i % 2 == 1 && j % 2 == 0) {
                    Tracker = 0;
                }

                System.out.print(Tracker + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floydsTriangle(10);
    }
}
