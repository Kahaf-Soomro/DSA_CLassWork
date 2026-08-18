package STACK;


public class LinkedStack {
    private int size;
    private Node top;
    private class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data = data;
        }
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
        return top.data;
    }
    public void push(Object ob) {
        Node newNode = new Node(ob);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object ob = top.data;
        top = top.next;
        size--;
       return ob;
    }
    

    // public StringBuffer toString(){
        
    //     return ;

    // }
}
