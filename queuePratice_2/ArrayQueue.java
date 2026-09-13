package queuePratice_2;

public class ArrayQueue {

    
            Object[] arr;
            int size;
            int front;
            int rear;
            public ArrayQueue(int capacity){
                arr = new Object[capacity];
                size = capacity;
                front = 0;
                rear = 0;


            }
            public int size() {
                return size;
            }
            public Object first() {
                if(size==0) throw new IllegalStateException("Empty queue");
                return arr[front];

    }

    public void add(Object obj) {

        if(size == arr.length){
            throw new IllegalStateException("Queue is Full");

        }
        arr[rear] = obj;
        rear = (rear+1) % arr.length;
        size++;
    }

    public Object remove() {
Object t = arr[front];
        arr[front] = null;
        front = (front+1) % arr.length;
        size--;
        return t;

    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<size; i++){
            int j = (front+i) % arr.length;
            sb.append(arr[j] );
            if(i<size-1){ sb.append("->");


            }
        }
        return sb.toString();

    }


}
