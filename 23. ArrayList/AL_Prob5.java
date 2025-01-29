import java.util.ArrayList;

public class AL_Prob5 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(9);
        // list.add(7);
        // list.add(1);

        int si = 0;
        int ei = list.size() - 1;
        int maxWater = 0;

        while (si < ei) {
            int ht = Math.min(list.get(si), list.get(ei));
            int currwater = ht * (ei - si);
            maxWater = Math.max(maxWater, currwater);

            if (list.get(si) < list.get(ei)) {
                si++;
            } else {
                ei--;
            }
        }

        System.out.print(maxWater);
    }
}
