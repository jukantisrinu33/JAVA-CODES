public class TwoDArrays_prob4 {
    public static void main(String args[]) {
        int array[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int sumOf2ndRow = 0;
        for (int j = 0; j < array[0].length; j++) {
            sumOf2ndRow += array[1][j];
        }

        System.out.print(sumOf2ndRow);
    }
}
