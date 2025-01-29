//pairs in array

public class Arrays_prob3 {

    public static void pairs(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                System.out.print("(" + array[i] + "," + array[j] + ")  ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int array[] = { 2, 4, 6, 8, 10 };
        pairs(array);
    }
}
