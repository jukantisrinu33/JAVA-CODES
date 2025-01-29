//kanades max of sum of sub arrays

public class Arrays_prob7 {
    public static void main(String args[]) {
        int array[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int currsum = 0;
        int maxsum = 0;
        for (int i = 0; i < array.length; i++) {
            currsum = currsum + array[i];
            if (currsum <= 0) {
                currsum = 0;
            }

            if (currsum > maxsum) {
                maxsum = currsum;
            }
        }
        System.out.print(maxsum);
    }
}
