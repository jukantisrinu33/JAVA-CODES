//hollow pattern

public class Function_prob5 {
    public static void width(int width) {
        for (int i = 1; i <= width; i++) {
            System.out.print("* ");
        }
        System.out.println();

    }

    public static void height(int height, int width) {

        for (int i = 2; i <= height - 1; i++) {
            for (int j = 1; j <= width; j++) {
                if ((j == 1) || (j == width)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    public static void hollowRectangle(int Heigth, int width) {
        width(width);
        height(Heigth, width);
        width(width);
    }

    public static void main(String args[]) {
        hollowRectangle(2, 4);
    }
}
