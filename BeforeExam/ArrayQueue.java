package BeforeExam;

public class ArrayQueue {
    private Object[] arr;
    private int size;
    private int front , rear;
    public ArrayQueue(int capacity){
        arr = new Object[capacity];
        size = 0;
        front = 0;
        rear = 0;

    }
      public ArrayQueue(){
        arr = new Object[50];
        size = 0;
        front = 0;
        rear = 0;
        
    }
    public int size(){
        return size;

    }
    public Object first(){
        if(size ==0)throw new IllegalStateException("empty queue");
        return arr[front];
    }
    public void add(Object obj){
        if(size==arr.length) throw new IllegalStateException("Full queue");
        arr[rear] = obj;
        rear = (rear+1) % arr.length;
        size++;

    }
    public Object remove(){
        if(size==0) throw new IllegalStateException("empty queue");
Object t = arr[front];
        arr[front ] = null;
        front = (front+1)%arr.length;
        size--;
        return t;
    }
    public String toString(){
        if(size==0) throw new IllegalStateException("empty");
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i<size ; i++){

            sb.append(arr[(front+i)% arr.length]);
            if(i<size-1) sb.append("->");
        }
        return sb.toString();

    }

    public Object last(){

        return arr[(rear-1+arr.length )% arr.length] ;

    }
    public void reverse(){
        Object[] temp = new Object[size];
        for(int i =size-1; i>=0; i--){
            temp[size-1-i] = arr[(front+i)%arr.length];
            
        }
        for(int i=0; i<size ; i ++){
            arr[(front+i)% arr.length] = temp[i];
        }

    }
}
