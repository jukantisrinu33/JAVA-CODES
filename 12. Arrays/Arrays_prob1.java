public class Arrays_prob1 {
    public static void main(String args[]) {
        int array[] = { -1, 0, 2, 3, 4, 5, 6, 7, 8, 9 };
        int start = 0;
        int end = array.length - 1;
        // System.out.print(end);
        int key = 8;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == key) {
                System.out.println(mid);
                break;
            } else if (array[mid] > key) {
                end = mid - 1;
            } else if (key > array[mid]) {
                start = mid + 1;
            } else {
                System.out.print("not found");
            }

        }
    }
}