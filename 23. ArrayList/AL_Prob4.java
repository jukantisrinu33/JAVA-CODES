//Bruteforce solution to find the maxWater b/w the two poles 

import java.util.ArrayList;

public class AL_Prob4 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        // list.add(1);

        int maxwater = 0;
        int min;
        for (int i = 0; i < list.size() - 1; i++) {
            int waterToright = 0;
            for (int j = 1; j < list.size(); j++) {
                if (list.get(i) < list.get(j)) {
                    min = list.get(i);
                } else {
                    min = list.get(j);
                }

                waterToright = min * (j - i);

                if (maxwater < waterToright) {
                    maxwater = waterToright;
                }

            }
        }

        System.out.println(maxwater);

    }
}