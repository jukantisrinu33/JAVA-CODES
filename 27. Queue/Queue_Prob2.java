//Create a Queue using two stacks [pop takes O(n)]

import java.util.Stack;

public class Queue_Prob2 {
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // pushing element

        public void push(int n) {
            s1.push(n);
        }

        // pop element O(n)

        public int pop() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int pop = s2.pop();
            if (s2.isEmpty()) {
                return pop;
            }

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return pop;
        }

        // peek

        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int peek = s2.peek();
            if (s2.isEmpty()) {
                return peek;
            }

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return peek;
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while (!q.isEmpty()) {
            System.out.print(q.peek());
            q.pop();
        }

    }
}
