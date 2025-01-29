//QuickSort

public class DAC_Prob2 {
    public static void main(String args[]) {
        int array[] = { 6, 3, 9, 8, 2, 5 };
        quickSort(array, 0, array.length - 1);
        PrintArray pa = new PrintArray();
        pa.printarr(array);

    }

    public static void quickSort(int array[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIndex = partition(array, si, ei);
        System.out.println(pIndex);
        quickSort(array, si, pIndex - 1);
        quickSort(array, pIndex + 1, ei);

    }

    public static int partition(int array[], int si, int ei) {
        int pivot = array[ei];
        int i = si - 1;
        int temp;
        for (int j = si; j <= ei; j++) {
            if (j == ei) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            } else if (pivot >= array[j]) {
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        return i;

    }
}
