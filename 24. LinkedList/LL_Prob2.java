public class LL_Prob2 {

    public static DoublyNode head;
    public static DoublyNode tail;
    public static int size;

    // Adding first
    public void addFirst(int data) {
        DoublyNode newnNode = new DoublyNode(data);
        if (head == null) {
            head = newnNode;
            tail = newnNode;
            size++;
            return;
        }
        head.prev = newnNode;
        newnNode.next = head;
        head = newnNode;
        size++;

    }

    // Adding Last
    public void addLast(int data) {
        DoublyNode newNode = new DoublyNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
        size++;
    }

    // removing first

    public void removeFirst() {
        if (head == null) {
            System.out.println("Linked List already Empty");
            return;
        }
        System.out.println("Removed Element is " + head.data);
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        head.prev = null;
        return;
    }

    // removing Last
    public void removeLast() {
        if (head == null) {
            System.out.println("Linked List already Empty");
            return;
        }
        System.out.println("Removed Element is " + tail.data);
        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }
        tail = tail.prev;
        tail.next = null;
        return;
    }

    // Reverse a Linked List(double)
    public void reverse() {
        if (head == null || size == 1) {
            return;
        }

        DoublyNode temp = head;
        head = tail;
        tail = temp;

        while (temp != null) {
            DoublyNode nextNode = temp.next;
            temp.next = temp.prev;
            temp.prev = nextNode;
            temp = nextNode;
        }

    }

    // printing
    public void print() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String args[]) {

        LL_Prob2 ll = new LL_Prob2();
        ll.addLast(6);
        ll.addLast(5);
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);
        ll.reverse();

        ll.print();

    }
}