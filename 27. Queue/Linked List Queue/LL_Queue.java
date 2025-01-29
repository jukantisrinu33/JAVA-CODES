
public class LL_Queue {

    static Node head;
    static Node tail;
    static int size;

    // is Empty in Linked list queue
    public boolean isEmpty() {
        return head == null;
    }

    // push in Linked list
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = tail.next;

    }

    // pop()
    public int pop() {
        if (isEmpty()) {
            System.out.println("Linked List is already Empty");
            return -1;
        }

        int deletedData = head.data;

        head = head.next;

        return deletedData;

    }

    // peek()
    public int peek() {
        if (isEmpty()) {
            System.out.println("Linked List is already Empty");
            return -1;
        }
        return head.data;
    }

    public static void main(String args[]) {
        LL_Queue q = new LL_Queue();
        q.push(1);
        q.push(2);
        q.push(3);
        while (!q.isEmpty()) {
            System.out.println(q.pop());
        }
    }
}
