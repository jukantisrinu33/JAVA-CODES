//Sudoku Solver

public class BTC_Prob6 {
    public static void main(String args[]) {
        int array[][] = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        sudoku(array, 0, 0);
    }

    public static boolean sudoku(int arr[][], int i, int j) {
        if (i == 9) {
            PrintArray.print(arr);
            return true;
        }

        int nextrow = i, nextcol = j + 1;
        if (j + 1 == 9) {
            nextrow = i + 1;
            nextcol = 0;
        }

        if (arr[i][j] != 0) {
            return sudoku(arr, nextrow, nextcol);
        }

        for (int element = 1; element <= 9; element++) {
            if (isSafe(arr, i, j, element)) {
                arr[i][j] = element;
                if (sudoku(arr, nextrow, nextcol)) {
                    return true;
                }
                arr[i][j] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int arr[][], int i, int j, int element) {
        // check col
        for (int row = 0; row <= 8; row++) {
            if (arr[row][j] == element) {
                return false;
            }
        }

        // checking row
        for (int col = 0; col <= 8; col++) {
            if (arr[i][col] == element) {
                return false;
            }
        }

        // checking grid

        int rowstart = (i / 3) * 3;
        int colstart = (j / 3) * 3;
        for (int row = rowstart; row < rowstart + 3; row++) {
            for (int col = colstart; col < colstart + 3; col++) {
                if (arr[row][col] == element) {
                    return false;
                }
            }
        }

        return true;
    }
}
