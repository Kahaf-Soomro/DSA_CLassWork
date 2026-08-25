package Queue;

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

    public String toString(){
        
              if(size ==0) try {
            throw new Exception("Queue is empty lol");
        } catch (Exception ex) {
            System.getLogger(LinkedQueue.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        StringBuffer sb = new StringBuffer();

        LinkedQueue tempQ = new LinkedQueue();
        while(size!=0){

            tempQ.add(tempQ.remove());
            sb.append(tempQ.remove());
            size--;

        }
        return sb.toString();
        
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

// public Object[] toArray(){

// }
}
