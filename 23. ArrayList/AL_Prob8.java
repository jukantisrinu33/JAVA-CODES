//monotone increasing or monotone decreasing

import java.util.ArrayList;

public class AL_Prob8 {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(2);
        list.add(1);

        System.out.print(monotonic(list));

    }

    public static boolean monotonic(ArrayList<Integer> list) {
        int start = list.get(0);
        int next = list.get(1);

        if (start > next) {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) < list.get(i + 1)) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    return false;
                }
            }

        }
        return true;
    }
}
