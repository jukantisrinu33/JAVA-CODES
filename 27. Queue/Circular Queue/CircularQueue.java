//circular queue

public class CircularQueue {
    public static void main(String args[]) {
        CircularQueueFunctions q = new CircularQueueFunctions(5);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        System.out.println(q.pop());
        q.push(6);
        while (!q.isEmpty()) {
            System.out.println(q.pop());
        }
    }
}
