public class Problem1 {
    public static void main(String[] args) {
        String array[] = { "sun", "earth", "mars", "mercury" };
        mergeSort(array, 0, array.length - 1);
        System.out.print(array[0] + " ");
        System.out.print(array[1] + " ");
        System.out.print(array[2] + " ");
        System.out.print(array[3] + " ");

    }

    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = (si + ei) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        partition(arr, si, mid, ei);
    }

    public static void partition(String arr[], int si, int mid, int ei) {
        int i = si;
        int j = mid + 1;
        int k = 0;
        String temp[] = new String[ei - si + 1];

        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) < 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (i = si, k = 0; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
}