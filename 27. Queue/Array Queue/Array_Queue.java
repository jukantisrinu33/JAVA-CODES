public class Array_Queue {
    public static void main(String args[]) {
        arrayqueueFunctions queue = new arrayqueueFunctions(5);
        queue.push(5);
        queue.push(4);
        queue.push(3);
        queue.push(2);
        queue.push(1);
        while (!queue.isEmpty()) {
            System.out.println(queue.pop());
        }

    }
}