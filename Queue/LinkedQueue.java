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
    

}
