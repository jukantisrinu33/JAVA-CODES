//Stack using 2 Queues

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Prob3 {
    public static class stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty();
        }

        // push function O(n)
        public void push(int n) {
            if (q1.isEmpty()) {
                q1.add(n);
                return;
            }

            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }

            q1.add(n);

            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        // pop O(1)
        public int pop() {
            if (q1.isEmpty()) {
                return -1;
            }

            return q1.remove();
        }

        // Peek O(1)
        public int peek() {
            if (q1.isEmpty()) {
                return -1;
            }

            return q1.peek();
        }
    }

    public static void main(String args[]) {

        stack s = new stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }

    }
}
