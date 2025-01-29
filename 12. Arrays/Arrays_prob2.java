//Reverse array

public class Arrays_prob2 {

    public static void main(String args[]) {
        int array[] = { 10, 20, 30, 4, 51, 54 };
        int temp;
        for (int i = 0; i < (array.length) / 2; i++) {
            temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }

        for (int i = 0; i < (array.length); i++) {
            System.out.print(array[i] + " ");
        }
    }
}
