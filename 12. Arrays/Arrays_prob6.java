//max of sum of sub arrays

public class Arrays_prob6 {
    public static void main(String args[]) {
        int array[] = { 1, -2, 6, -1, 3 };
        int prefixArray[] = new int[array.length];
        int sum = 0;
        int subArrays_sum = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {

            sum = sum + array[i];
            prefixArray[i] = sum;

        }

        for (int i = 0; i < prefixArray.length - 1; i++) {
            int start = i;
            for (int j = i + 1; j < prefixArray.length; j++) {
                int end = j;
                if (start == 0) {
                    subArrays_sum = prefixArray[end];
                } else {
                    subArrays_sum = prefixArray[end] - prefixArray[start - 1];
                }

                if (subArrays_sum > max) {
                    max = subArrays_sum;
                }
            }
        }

        System.out.print(max);
    }
}
