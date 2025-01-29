public class Sorting_Insertion {

    public static void insertion() {
        int array[] = { 0, 4, 1, 3, 2 };
        for (int i = 1; i < array.length; i++) {
            int minValue = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[minValue]) {
                    int temp = array[minValue];
                    array[minValue] = array[j];
                    array[j] = temp;
                    minValue = j;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String args[]) {
        insertion();
    }
}
