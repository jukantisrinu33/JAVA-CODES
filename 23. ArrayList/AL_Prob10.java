//leet code -2190. Most Frequent Number Following Key In an Array

public class AL_Prob10 {
    public static void main(String args[]) {
        int nums[] = new int[5];
        nums[0] = 1;
        nums[1] = 100;
        nums[2] = 200;
        nums[3] = 1;
        nums[4] = 100;
        int max = 0;
        int prevmax = 0;

        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        int array[] = new int[max + 1];

        int key = 1;
        int target = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                target = nums[i + 1];
                // System.out.print(target);
                array[target]++;
            }
        }
        max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                prevmax = i;
            }
        }

        System.out.print(prevmax);
    }
}
