//Inverted rotated half pyramid

public class Function_prob6 {

    public static void inverRotateHalfPyramid(int rows, int cols) {

        for (int i = 1; i <= rows; i++) {
            int colTrack = 0;
            for (int j = 1; j <= cols; j++) {
                if (colTrack < (cols - i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
                colTrack++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        inverRotateHalfPyramid(10, 10);
    }
}