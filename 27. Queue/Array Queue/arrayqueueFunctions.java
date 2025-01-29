public class arrayqueueFunctions {
    // Initailzing the array for queue
    static int size;
    static int array[];
    static int rare;

    public arrayqueueFunctions(int n) {// int n defines the size of array from user while creating the object of this
        array = new int[n];
        size = n;
        rare = -1;

    }

    // isEmpty function
    public boolean isEmpty() {
        if (rare == -1) {
            return true;
        }
        return false;
    }

    // push function()
    public void push(int data) {
        if (rare == size - 1) {
            System.out.print("Queue is full");
            return;
        }

        rare++;
        array[rare] = data;
    }

    // pop - as the front should always be index 0 we should move all the elements
    // to front
    public int pop() {
        if (rare == -1) {
            System.out.print("Array is already empty");
            return -1;
        }

        int deletedElement = array[0];
        for (int i = 0; i < rare; i++) {
            array[i] = array[i + 1];
        }
        array[rare] = 0;
        rare--;
        return deletedElement;

    }

    // peek()

    public int peek() {
        if (rare == -1) {
            System.out.print("Array is already empty");
            return -1;
        }

        int peekData = array[0];
        return peekData;

    }
}
