//Tiling Problem 

public class Recursion_Prob10 {

    public static void main(String args[]) {
        System.out.print(tilingProblem(3));
    }

    public static int tilingProblem(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int nm1 = tilingProblem(n - 1);
        int nm2 = tilingProblem(n - 2);

        int totalways = nm1 + nm2;
        return totalways;
    }

}
