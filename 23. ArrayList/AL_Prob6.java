//Print one pair where sum of the pair is equal to numbers(Sorted)

import java.util.ArrayList;

public class AL_Prob6 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int key = 10;

        int si = 0;
        int ei = list.size() - 1;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(si) + list.get(ei) == key) {
                System.out.print("true");
                break;
            }
            if (list.get(si) + list.get(ei) < key) {
                si++;
            } else {
                ei--;
            }
        }

    }
}
