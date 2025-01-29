import java.util.ArrayList;

public class Stack_AL {
    static ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        }
        return false;
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        int top = list.get(list.size() - 1);
        return top;
    }
}
