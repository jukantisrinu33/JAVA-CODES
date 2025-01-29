public class TwoDArrays_prob5 {
    public static void main(String args[]) {
        int array1[][] = { { 11, 11, 13 }, { 21, 22, 23 } };
        int rows = array1.length;
        int cols = array1[0].length;
        int array2[][] = new int[cols][rows];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                array2[j][i] = array1[i][j];
            }
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[0].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
