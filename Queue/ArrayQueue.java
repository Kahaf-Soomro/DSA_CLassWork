package Queue;

public class ArrayQueue implements QueueInterface {

    private Object[] arr;
    private int size;
    private int front;
    private int rear;

    public ArrayQueue(int capacity) {

        arr = new Object[capacity];
        size = 0;
        front = 0;
        rear = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object first() {

        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        return arr[front];
    }

    @Override
    public void add(Object obj) {

        if (size == arr.length) {
            throw new IllegalStateException("Queue is full");
        }

        arr[rear] = obj;

        rear = (rear + 1) % arr.length;

        size++;
    }

    @Override
    public Object remove() {

        if (size == 0) {
            throw new IllegalStateException("Queue is empty");
        }

        Object temp = arr[front];

        arr[front] = null;

        front = (front + 1) % arr.length;

        size--;

        return temp;
    }

    @Override
    public String toString() {

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < size; i++) {

            int index = (front + i) % arr.length;

            result.append(arr[index]);

            if (i < size - 1) {
                result.append(" -> ");
            }
        }

        return result.toString();
    }
}