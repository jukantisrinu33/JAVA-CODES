//First non repeating element(character) only small Characters

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Prob4 {

    public static void nonRepeating(String str) {
        int[] array = new int[26];
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            q.add(str.charAt(i));
            int index = str.charAt(i) - 97;
            array[index]++;

            while (!q.isEmpty() && array[(q.peek() - 97)] != 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + "  ");
            } else {
                System.out.print(q.peek() + " ");
            }

        }
    }

    public static void main(String args[]) {
        String str = "aabccxb";
        nonRepeating(str);
    }
}
