package Queue;

import java.util.Queue;

public class LinkedQueue implements QueueInterface {


    int size = 0;

    public LinkedQueue(){
        size = 0;
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
        return 1;

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

    @Override
    public void add(Object obj) {

            Node lastElement = head.previous;
lastElement.next = new Node(obj, lastElement, head);

                // head.previous.next = new Node( obj, head.previous, head);
                lastElement =   lastElement.next ;
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

        Node firstElement = head.next;
            firstElement = firstElement.next;
            firstElement.previous = head;
            --size;
            

        return temp;

        
    }
    

}
