public class Function_prob11 {

    public static void rhombus(int rows) {
        int cols = rows + rows;
        for (int i = 1; i <= rows; i++) {
            int counter1 = rows - i;
            int counter2 = 1;
            for (int j = 1; j <= cols; j++) {
                if (j <= counter1) {
                    System.out.print("  ");
                } else if (counter2 <= rows) {
                    System.out.print("* ");
                    counter2++;
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String args[]) {
        rhombus(10);
    }
}
