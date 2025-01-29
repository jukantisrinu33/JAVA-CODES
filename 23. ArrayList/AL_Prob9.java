//Lonely element

import java.util.ArrayList;

public class AL_Prob9 {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(3);
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int elementAtIndex = list.get(i);
            if (list.contains(elementAtIndex)) {
                list.remove(i);
                if (list.contains(elementAtIndex)) {
                    list.add(i, elementAtIndex);
                    continue;
                }
                list.add(i, elementAtIndex);

            }
            if (list.contains(elementAtIndex - 1)) {
                continue;
            }
            if (list.contains(elementAtIndex + 1)) {
                continue;
            }

            list2.add(elementAtIndex);

        }
        System.out.print(list2);

    }
}
