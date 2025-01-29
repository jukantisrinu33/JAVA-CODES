public class CircularQueueFunctions {
    // Initailzing the array for queue
    static int size;
    static int array[];
    static int rare;
    static int front;

    public CircularQueueFunctions(int n) {// int n defines the size of array from user while creating the object of this
        array = new int[n];
        size = n;
        rare = -1;
        front = -1;

    }

    // isEmpty function
    public boolean isEmpty() {
        if (rare == -1 && front == -1) {
            return true;
        }
        return false;
    }

    // is full function
    public boolean isFull() {
        return (rare + 1) % size == front;
    }

    // push function()
    public void push(int data) {
        if (isFull()) {
            System.out.print("Queue is full");
            return;
        }
        if (front == -1) {
            front++;
        }
        rare = (rare + 1) % size;
        array[rare] = data;
    }

    // pop - as the front should always be index 0 we should move all the elements
    // to front
    public int pop() {
        if (isEmpty()) {
            System.out.print("Array is already empty");
            return -1;
        }

        int deletedElement = array[front];
        if (rare == front) {
            rare = front = -1;
        } else {
            front = (front + 1) % size;
        }

        return deletedElement;

    }

    // peek()

    public int peek() {
        if (isEmpty()) {
            System.out.print("Array is already empty");
            return -1;
        }

        int peekData = array[front];
        return peekData;

    }
}
