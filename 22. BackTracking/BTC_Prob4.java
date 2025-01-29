//N - Queens Problem

public class BTC_Prob4 {

    public static void main(String[] args) {
        int n = 4;
        char array[][] = new char[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 'X';
            }
        }

        nQueens(array, 0);

    }

    public static void nQueens(char arr[][], int i) {
        if (i == arr.length) {
            PrintArray.print(arr);
            System.out.println("--------------------------");
            return;
        }

        for (int j = 0; j < arr.length; j++) {
            if (isSafe(arr, i, j)) {
                arr[i][j] = 'Q';
                nQueens(arr, i + 1);
                arr[i][j] = 'X';
            }
        }
    }

    public static boolean isSafe(char arr[][], int row, int col) {
        // top
        for (int i = row - 1; i >= 0; i--) {
            if (arr[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal Right

        for (int i = row - 1, j = col + 1; i >= 0 && j < arr.length; i--, j++) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal Right
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (arr[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }
}