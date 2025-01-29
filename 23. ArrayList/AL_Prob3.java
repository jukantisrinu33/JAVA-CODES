import java.util.ArrayList;

public class AL_Prob3 {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // list 1
        ArrayList<Integer> list1 = new ArrayList<>();
        // adding elements to list 1
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        // adding list 1 to mainList
        mainList.add(list1);

        // list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        // adding elements to list 2
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        // adding list 2 to mainList
        mainList.add(list2);

        // list 3
        ArrayList<Integer> list3 = new ArrayList<>();
        // adding elements to list 3
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);

        // adding list 3 to mainList
        mainList.add(list3);

        // printing The main ArrayList directly
        System.out.println(mainList);

        // Printing mainList using loops
        for (int i = 0; i < mainList.size(); i++) {
            ArrayList<Integer> currlist = mainList.get(i);
            for (int j = 0; j < currlist.size(); j++) {
                System.out.print(currlist.get(j) + " ");
            }
            System.out.println();
        }

    }
}
