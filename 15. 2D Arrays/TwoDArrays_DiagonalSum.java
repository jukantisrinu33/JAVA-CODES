public class TwoDArrays_DiagonalSum {
    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        int rows = matrix.length;
        int diagonal1Sum = 0;
        int diagonal2Sum = 0;

        for (int i = 0; i < rows; i++) {
            int j = i;
            diagonal1Sum = diagonal1Sum + matrix[i][j];

            if (j != (rows - i - 1)) {
                diagonal2Sum = diagonal2Sum + matrix[i][rows - i - 1];
            }

        }

        System.out.print(diagonal1Sum + " + " + diagonal2Sum + " = " + (diagonal1Sum + diagonal2Sum));

    }
}
