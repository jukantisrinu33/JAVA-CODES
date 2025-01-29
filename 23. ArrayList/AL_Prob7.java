//Print one pair where sum of the pair is equal to numbers(Sorted and rotated)

import java.util.ArrayList;

public class AL_Prob7 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(1);
        list.add(2);

        int key = 10;

        int breakpoint = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakpoint = i;
            }
        }

        int si = breakpoint + 1;
        int ei = breakpoint;

        for (int i = 0; i < list.size(); i++) {
            if (ei == -1) {
                ei = list.size() - 1;
            }

            if (si == list.size() - 1) {
                si = 0;
            }
            if (list.get(si) + list.get(ei) == key) {
                System.out.print(list.get(si) + ", " + list.get(ei));
                break;
            }
            if (list.get(si) + list.get(ei) > key) {
                ei--;
            } else {
                si++;
            }
        }
    }
}
