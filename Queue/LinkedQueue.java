package Queue;

import java.util.Stack;

public class LinkedQueue implements QueueInterface {


    int size = 0;

    public LinkedQueue(){
        size = 0;
    }
     public LinkedQueue(int s){
        size = s;
    }

    private static class Node{
        Object data;
        Node previous  =this;
        Node next =  this;
         public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node next, Node prev){

                this.data = data;
                this.next = next;
                this.previous = prev;

            



        }


    }

    private Node head = new Node(null);
   




    @Override
    public int size() {
        return size;

    }

    @Override
    public Object first() {
        
        if(size ==0) try {
            throw new Exception("Queue is empty lol");
        } catch (Exception ex) {
            System.getLogger(LinkedQueue.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return head.next.data;
        
    }
 public Object last() {
        
        if(size ==0) try {
            throw new Exception("Queue is empty lol");
        } catch (Exception ex) {
            System.getLogger(LinkedQueue.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return head.previous.data;
        
    }
    @Override
    public void add(Object obj) {

head.previous.next = new Node(obj, head.previous, head);

                // head.previous.next = new Node( obj, head.previous, head);
                head.previous =   head.previous.next ;
                ++size;

                System.out.println("New Node Added");

    }

    @Override
    public Object remove() {
             if(size ==0) try {
            throw new Exception("Queue is empty lol");
        } catch (Exception ex) {
            System.getLogger(LinkedQueue.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }



        Object temp = head.next.data;

     
             head.next =  head.next.next;
             head.next.previous = head;
            --size;


        return temp;

        
    }

    
    @Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }

    if (obj == null) {
        return false;
    }

    LinkedQueue other = (LinkedQueue) obj;

    if (this.size != other.size) {
        return false;
    }

    Node currentThis = this.head.next;
    Node currentOther = other.head.next;

    while (currentThis != this.head) {
        Object d1 = currentThis.data;
        Object d2 = currentOther.data;

        if (d1 == null) {
            if (d2 != null) {
                return false;
            }
        } else if (!d1.equals(d2)) {
            return false;
        }

        currentThis = currentThis.next;
        currentOther = currentOther.next;
    }

    return true;
}

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();

        Node current = head.next;

        while (current != head) {

            sb.append(current.data);

            if (current.next != head) {
                sb.append(" -> ");
            }

            current = current.next;
        }

        return sb.toString();
    }


    public Object[] toArray() {

        Object[] arr = new Object[size];

        Node current = head.next;

        int i = 0;

        while (current != head) {

            arr[i] = current.data;

            i++;
            current = current.next;
        }

        return arr;
    }

    public Object[] toArray(int start, int end) {

        if (start < 0 || end >= size || start > end) {
            throw new IndexOutOfBoundsException("Invalid start or end");
        }

        Object[] arr = new Object[end - start + 1];

        Node current = head.next;

         for (int i = 0; i < start; i++) {
            current = current.next;
        }

        // Copy elements from start to end
        for (int i = 0; i < arr.length; i++) {

            arr[i] = current.data;

            current = current.next;
        }

        return arr;
    }

    public Object[] lastN(int n) {

        if (n < 0 || n > size) {
            throw new IllegalArgumentException("Invalid number of elements");
        }

        Object[] arr = new Object[n];

        Node current = head.next;

        for (int i = 0; i < size - n; i++) {
            current = current.next;
        }

        for (int i = 0; i < n; i++) {

            arr[i] = current.data;

            current = current.next;
        }

        return arr;
    }


    public Stack<Object> queueStack() {

        Stack<Object> stack = new Stack<>();

        Node current = head.next;

        while (current != head) {

            stack.push(current.data);

            current = current.next;
        }

        return stack;
    }
}
