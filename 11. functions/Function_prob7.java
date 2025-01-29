//Inverted half pyramid with numbers

public class Function_prob7 {

    public static void invertedHalfPyramid(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= i; j--) {
                System.out.print(num - j + 1 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        invertedHalfPyramid(5);
    }

}
