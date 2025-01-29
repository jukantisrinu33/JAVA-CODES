//Interleave 2 Halfs of a queue 
// given queue is always even

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Prob5 {

    public static void interleave2Halfs(Queue<Integer> q1) {
        Queue<Integer> q2 = new LinkedList<>();
        int count = 0;

        // finding the length of Queue
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
            count++;
        }

        // dividing the queue based on length ie removing half elements from queue(q2 )
        // and
        // pushing to q1

        int i = 1;
        while (i <= count / 2) {
            q1.add(q2.remove());
            i++;
        }

        // as q1 and q2 have half half elements
        // adding the pattern to the back of main queue (q1 )
        // ie q1 element and q2 element until q2 becomes null

        while (!q2.isEmpty()) {
            q1.add(q1.remove());
            q1.add(q2.remove());
        }

        return;

    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        interleave2Halfs(q);

        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

    }
}
