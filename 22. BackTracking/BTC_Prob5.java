public class BTC_Prob5 {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;
        int array[][] = new int[n][m];
        System.out.println(array[0].length);
        gridWays(array, 0, 0);

    }

    public static void gridWays(int arr[][], int i, int j) {
        if ((i == arr.length - 1 && j == arr[0].length)) {
            System.out.println("_________________");
            PrintArray.print(arr);
            return;
        }
        if (i == arr.length || j == arr[0].length) {
            return;
        }

        arr[i][j] = 1;
        gridWays(arr, i, j + 1);
        gridWays(arr, i + 1, j);
        arr[i][j] = 0;

    }
}