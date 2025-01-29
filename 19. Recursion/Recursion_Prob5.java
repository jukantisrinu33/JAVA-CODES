//Check if an array is sorted in ascending  or not

public class Recursion_Prob5 {
    public static void main(String args[]) {
        int array[] = { 1, -2, 5, 100 }; // Minimum condition : Atleast 1 element in array
        System.out.print(sorted(array, array.length - 1));
    }

    public static boolean sorted(int array[], int index) {
        if (array.length - index == array.length) {
            return true;
        }
        if (array[index] > array[index - 1]) {
            return sorted(array, index - 1);
        } else {
            return false;
        }

    }
}
