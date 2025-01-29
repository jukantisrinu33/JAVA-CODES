//Floydds traingle pattern

public class Function_prob8 {

    public static void floydsTriangle(int num) {
        int Tracker = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(Tracker + " ");
                Tracker++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        floydsTriangle(5);
    }
}
