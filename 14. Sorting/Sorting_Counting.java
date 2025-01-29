public class Sorting_Counting {
    public static void main(String args[]) {
        int array[] = { 0, 3, 1, 2, 4, 2, 6 };
        int max = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] > array[i]) {
                max = array[i + 1];
            }
        }

        int counting[] = new int[max + 1];

        for (int i = 0; i < array.length; i++) {
            int j = array[i];
            counting[j]++;
        }
        int indexStart = 0;

        for (int i = 0; i < counting.length; i++) {
            while (counting[i] > 0) {
                array[indexStart] = i;
                counting[i]--;
                indexStart++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

    }
}
