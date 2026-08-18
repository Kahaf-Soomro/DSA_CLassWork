package STACK;
public class ArrayStack   {
    private int size;
    private Object[] a;
    public ArrayStack(int capacity) {
        a = new Object[capacity];
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return a[size - 1];
    }
    public void push(Object ob) {
        if (size == a.length) {
            resize();
        }
        a[size] = ob;
        size++;
    }
    private void resize() {
        Object[] old = a;
        a = new Object[2 * old.length];
        System.arraycopy(old, 0, a, 0, size);
    }
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object ob = a[size - 1];
        a[size - 1] = null;
        size--;
        return ob;
    }
     

    public LinkedStack toLinkedStack(){
        LinkedStack ls = new LinkedStack();
        for(int i =0; i<size; i++){
            
            ls.push(this.pop());
        }

        

        
        return ls;
    }
}