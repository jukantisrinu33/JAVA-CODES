
public class LL_Prob1 {

    public static Node head;
    public static Node tail;
    public static int size;

    // Adding element at first
    public void addFirst(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;

    }

    // Adding element At last
    public void addLast(int data) {
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = newnode;
            tail = newnode;
            return;
        }
        tail.next = newnode;
        tail = newnode;
    }

    // Adding element at a specific Index
    public void add(int index, int data) {
        int tracker = 0;
        Node presentNode = head;
        Node previousNode = head;

        if (index == 0) {
            addFirst(data);

            return;
        }
        while (presentNode != null) {
            if (tracker == index) {
                Node newnode = new Node(data);
                previousNode.next = newnode;
                newnode.next = presentNode;
                size++;
                return;
            }

            previousNode = presentNode;
            presentNode = presentNode.next;
            tracker++;

        }

        System.out.println("Index Out of Bound");
    }

    // remove First

    public int removeFirst() {
        if (head == null) {
            System.out.println("Linked List is already Empty");
            return -1;
        }
        int deletedData = head.data;
        System.out.println("Deleted element: " + deletedData);
        head = head.next;
        size--;
        return deletedData;
    }

    // Remove Last
    public void removeLast() {
        if (head == null) {
            System.out.println("Linked List is already Empty");
            return;
        }
        int deletedData = tail.data;
        System.out.println("Deleted data :" + deletedData);

        Node currNode = head;
        Node prevNode = head;
        if (size == 1) {
            head = tail = null;
            size--;
            return;
        }
        while (currNode.next != null) {
            prevNode = currNode;
            currNode = currNode.next;
        }
        tail = prevNode;
        prevNode.next = null;
        size--;

    }

    // Find and Remove Nth Node from End(Iterative approach)
    public void removeMiddle(int n) {
        int index = size - n;
        if (n == 1) {
            removeLast();

            return;
        }
        if (n == size) {
            removeFirst();
            return;
        }
        if (size == 0 || n == 0) {
            System.out.println("Cant delete the Index Value");
            return;
        }
        Node prevNode = head;
        Node currNode = head;
        Node nextNode = currNode.next;

        for (int i = 0; i < index; i++) {
            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }

        prevNode.next = nextNode;
        currNode.next = null;
        size--;
    }

    // Iterative Search {Search for a given key and return Index
    // if not found return-1}

    public int searchIterative(int key) {
        Node temp = head;
        int Index = 0;
        while (temp != null) {
            if (temp.data == key) {
                return Index;
            }
            temp = temp.next;
            Index++;
        }
        return -1;
    }

    // Recursive Search {Search for a given key and return Index
    // if not found return-1}

    public int searchHelper(Node currNode, int index, int key) {
        if (currNode == null) {
            return -1;
        }
        if (currNode.data == key) {
            return index;
        }
        currNode = currNode.next;
        index++;
        return searchHelper(currNode, index, key);

    }

    public int searchRecursive(int key) {
        return searchHelper(head, 0, key);
    }

    // Reverse a linked List

    public void reverse() {
        if (size == 0 || size == 1) {
            return;
        }
        if (size == 2) {
            Node temp = head;
            tail.next = head;
            head.next = null;
            head = tail;
            tail = temp;

            return;
        }

        Node prevNode = head, currNode = head.next, nextNode = currNode.next;
        tail = prevNode;
        while (nextNode.next != null) {
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            nextNode = currNode.next;
        }
        head = nextNode;
        currNode.next = prevNode;
        nextNode.next = currNode;
        tail.next = null;
        return;

    }

    // check if the data in the Linked list is a palindrome;

    // slow fast approach for finding mid
    public Node mid() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // checking if the data in Linked list is of palindrome type

    public boolean palindrome() {

        if (head == null || head.next == null) {
            return true;
        }
        // finding mid (Step 1)
        Node midNode = mid();

        // reversing the elements after the mid (2nd Half)

        if (midNode.next == null) {
            if (head.data != midNode.data) {
                return false;
            }
            return true;
        }

        Node prevNode = null;
        Node currNode = midNode;
        Node nextNode = currNode.next;
        while (nextNode.next != null) {
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            nextNode = nextNode.next;
        }
        nextNode.next = currNode;
        currNode.next = prevNode;
        midNode.next = null;
        Node endPointer = nextNode;

        // comparing values

        Node startPointer = head;
        while (startPointer != null && endPointer != null) {
            if (startPointer.data != endPointer.data) {
                return false;
            }
            startPointer = startPointer.next;
            endPointer = endPointer.next;
        }
        return true;

    }

    // Detetcting the cycle in a Linked List
    public boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Moves by +1
            fast = fast.next.next; // Moves by +2
            if (fast == slow) {
                return true; // Cycle exists
            }
        }
        return false; // Cycle doesnot exists
    }

    // Removing the cycle
    public void removeCycle() {
        boolean isCycle = isCycle();
        if (isCycle == false) {
            return;
        }
        Node prev = null;
        Node slow = head.next;
        Node fast = head.next.next;
        while (fast != slow) {

            slow = slow.next;
            if (fast.next.next == slow && fast.next.next == head) { // base case where the slow and
                prev = fast.next; // fast meet at head
            }
            fast = fast.next.next;

        }
        if (prev != null) { // if slow and fast meet(Link to head)
            prev.next = null; // at head prev wont be null from the above if condition
            tail = prev;
            return;
        }

        // if the link is not to head
        // making slow to head again and moving the slow and fast by +1 each this time
        // to find the link
        // and we are trying to store the prev value of next so the we can break the
        // link
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null;
        tail = prev;

    }

    // finding the mid Node (according to the indexes) here mid is first half last
    // Node
    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge Sort Code
    public void mergeSort(Node head) {
        if (head == null || head.next == null) {
            return;
        }

        Node mid = getMid(head);
        Node nextHead = mid.next;
        mid.next = null;

        mergeSort(head);
        mergeSort(nextHead);
        Node main = merge(LL_Prob1.head, nextHead);// we can write "this.head" as classname.head for static variables
        LL_Prob1.head = main;

    }

    // merging code
    public Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    // Zig-zag Linked list
    public void zigZag() {
        // finding mid
        Node mid = getMid(head);

        // reversing the 2nd Half
        Node currNode = mid.next;
        mid.next = null;
        Node nextNode;
        Node prevNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }

        Node left = head;
        Node right = prevNode;
        Node nextL, nextR;
        while (left != null && right != null) {
            nextL = left.next;
            nextR = right.next;
            left.next = right;
            right.next = nextL;
            left = nextL;
            right = nextR;
        }

    }

    // Printing the LinkedList
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL_Prob1 ll = new LL_Prob1();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        // ll.addLast(5);
        ll.zigZag();

        // ll.add(0, 0);
        // ll.addFirst(1);
        // System.out.println(size);
        // int key = 5;
        // System.out.println("The index of the Key is : " + ll.searchIterative(key));
        // System.out.println("The index of the Key is : " + ll.searchRecursive(key));
        // ll.reverse();
        // ll.removeMiddle(4);
        // ll.print();
        // System.out.print(ll.palindrome());

        ll.print();
    }
}
