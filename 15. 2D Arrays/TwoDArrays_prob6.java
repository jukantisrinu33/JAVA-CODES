public class TwoDArrays_prob6 {
    public static String Sorted2DArray(int array[][], int key) {
        int row = 0;
        int cols = array[0].length - 1;

        while (row <= array.length - 1 && cols >= 0) {
            if (array[row][cols] > key) {
                cols--;
            } else if (array[row][cols] < key) {
                row++;
            } else if (array[row][cols] == key) {
                System.out.println("array[ " + row + " ]" + "[ " + cols + " ]");
                return "Element found";
            }
        }

        return "not found";
    }

    public static void main(String args[]) {
        int array[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 31, 33, 39, 50 } };
        int key = 15;

        System.out.print(Sorted2DArray(array, key));

    }
}
