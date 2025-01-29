//Back Tracking on arrays

public class BTC_Prob1 {

    public static void main(String[] args) {
        int array[] = new int[5];
        fillArray(array, 0);
        PrintArray.print(array);
    }

    public static void fillArray(int array[], int i) {
        if (i == array.length) {
            return;
        }

        array[i] = i + 1;
        fillArray(array, i + 1);
        array[i] = array[i] - 2;
    }

}
