//First occurence of element

public class Recursion_Prob6 {
    public static void main(String args[]) {
        int array[] = { 0, 1, 2, 3, 4 };
        int key = 4;
        System.out.println(firstOccurence(array, key, 0));

    }

    public static int firstOccurence(int array[], int key, int i) {
        if (i == array.length) {
            return -1;
        }
        if (array[i] == key) {
            return i;
        }
        return firstOccurence(array, key, i + 1);

    }

}
