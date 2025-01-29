//Queue reversal

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Just using a stack to reverse queue

public class Queue_Prob6 {

    public static void queueReversal(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();

        while (!q.isEmpty()) {
            s.push(q.remove());
        }

        while (!s.isEmpty()) {
            q.add(s.pop());
        }

    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        queueReversal(q);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
    }
}
