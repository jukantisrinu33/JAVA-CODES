//Max sum of sub arrays

public class Arrays_prob5 {

    public static void main(String args[]) {

        int array[] = { 1, -2, 6, -1, 6 };
        int max = 0;
        int sum = 0;
        for (int i = 0; i < array.length - 1; i++) {

            for (int j = i; j < array.length; j++) {

                sum = 0;
                System.out.print("[");

                for (int k = i; k <= j; k++) {

                    sum = array[k] + sum;
                    if (max < sum) {
                        max = sum;
                    }
                    System.out.print(array[k] + ",");
                }

                System.out.print("]");

            }
            System.out.println();
        }

        System.out.println(max);
    }

}
