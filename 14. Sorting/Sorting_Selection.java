public class Sorting_Selection {

    public static void selection(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            int minValue = i;
            for (int j = i; j < array.length; j++) {
                if (array[minValue] > array[j]) {
                    minValue = j;
                }
            }
            int temp = array[minValue];
            array[minValue] = array[i];
            array[i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String args[]) {
        int array[] = { 5, 4, 3, 1, 2 };
        selection(array);

    }
}
