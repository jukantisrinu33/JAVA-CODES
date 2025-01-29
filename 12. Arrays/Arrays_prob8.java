//Trappped Rain water

public class Arrays_prob8 {

    public static int TrappedWater(int array[], int width) {

        int leftMax[] = new int[array.length];
        int max = 0;
        int rightMax[] = new int[array.length];
        int totalWaterTrapped = 0;
        int water_at_each_height = 0;

        // Left Max boundary
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                leftMax[i] = array[i];
                max = array[i];
            } else {
                leftMax[i] = max;
            }
        }
        max = 0;

        // Right max boundary
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > max) {
                rightMax[i] = array[i];
                max = array[i];
            } else {
                rightMax[i] = max;
            }
        }

        // loop
        for (int i = 0; i < array.length; i++) {

            // water level= (min ( leftmax , rigthmax ) - heigth)+ width
            int min = Math.min(leftMax[i], rightMax[i]);
            water_at_each_height = (min - array[i]);
            if (water_at_each_height >= 0) {
                totalWaterTrapped = (totalWaterTrapped + water_at_each_height) * width;
            }
        }
        return totalWaterTrapped;
    }

    public static void main(String args[]) {
        int array[] = { 4, 2, 0, 6, 3, 2, 5 };
        int width = 1;
        int totalWaterTrapped = TrappedWater(array, width);

        System.out.print(totalWaterTrapped);
    }

}
