//Last occurence of element

public class Recursion_Prob7 {
    public static void main(String args[]) {
        int array[] = { 1, 3, 2, 5, 3, 4, 5 };
        int key = 3;
        System.out.print(lastoccurence(array, key, array.length - 1));
    }

    public static int lastoccurence(int array[], int key, int i) {
        if (i == -1) {
            return -1;
        }
        if (array[i] == key) {
            return i;
        } else {
            return lastoccurence(array, key, i - 1);
        }
    }
}
