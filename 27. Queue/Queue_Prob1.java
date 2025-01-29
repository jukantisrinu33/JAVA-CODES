//Create a Queue using two stacks [push takes O(n)]

import java.util.Stack;

public class Queue_Prob1 {
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty();
        }

        // pushing element O(n)

        public void push(int n) {

            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(n);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // pop element

        public int pop() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        // peek

        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while (!q.isEmpty()) {
            System.out.print(q.pop());
        }

    }
}
