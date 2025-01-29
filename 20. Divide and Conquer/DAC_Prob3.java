//Sorted and roatated array

public class DAC_Prob3 {
    public static void main(String args[]) {
        int array[] = { 4, 5, 6, 7, 1, 2, 3 };
        System.out.print(sortedRotated(array, 3, 0, array.length - 1));
    }

    public static int sortedRotated(int array[], int key, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = (si + ei) / 2;
        if (array[mid] == key) {
            return mid;
        }

        // mid on line 1
        if (array[mid] > array[si]) {
            if (array[mid] > key && key > array[si]) {
                return sortedRotated(array, key, si, mid - 1);
            } else {
                return sortedRotated(array, key, mid + 1, ei);
            }

            // mid on line 1
        } else {
            if (key > array[mid] && key < array[ei]) {
                return sortedRotated(array, key, mid + 1, ei);
            } else {
                return sortedRotated(array, key, si, mid - 1);
            }
        }

    }
}
