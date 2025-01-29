//Trying to create a queue using Deque
//we can also make a queue using a Deque

import java.util.Deque;
import java.util.LinkedList;

public class Queue_Prob7 {

    public static class Stack {
        static Deque<Integer> deque = new LinkedList<>();

        // isEmpty()
        public boolean isEmpty() {
            return deque.isEmpty();
        }

        // push function
        public void push(int data) {
            deque.addLast(data);
        }

        // pop function
        public int pop() {
            return deque.removeLast();
        }

        // peek()
        public int peek() {
            return deque.getLast();
        }

    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()) {
            System.out.print(s.pop());
        }

    }
}
