public class Sorting_Bubble {

    public static void bubble(int array[]) {

        int temp = 0;
        int swapCheck = 0, swap = 0;
        for (int i = 0; i < array.length - 1; i++) {

            // Extra code to reduce the Loops running even if array is sorted
            if (i == 0) {

            } else if (swap == swapCheck) {
                break;
            } else {
                swapCheck = swap;
            }

            // till here

            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                    temp = 0;
                    swap++;
                }
            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("swaps = " + swap);

    }

    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        bubble(array);

    }
}