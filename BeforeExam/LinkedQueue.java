package BeforeExam;

public class LinkedQueue {
     class  Node{
        Object data;
        Node previous = this; 
        Node next = this;
        
        public Node(Object data) {this.data = data;}
        public Node (Object data, Node prev, Node next){
            this(data);
            previous = prev;
            this.next = next;

        }

    }

    
    Node head = new Node(null);
    int size = 0;
    public int size() {return size;}
    public void add(Object obj){
        head.previous.next = new Node(obj, head.previous, head); 
        head.previous = head.previous.next;
        size++;
    }
    public Object remove(){
            if(size ==0) throw new IllegalStateException("Empty queue");
        Object temp = head.next.data;
            head.next = head.next.next;
        head.next.previous = head;
        size--;
        return temp;

        }
            public Object getMiddle(){
                            if(size ==0) throw new IllegalStateException("Empty queue");

                                int h = size/2;
                Node temp = head.next;
                for(int i =0; i<h; i++){
                    temp = temp.next;


                } 
                return temp.data;
                            }

                            public LinkedQueue mergeQueues( LinkedQueue q2){
                                if(this.size() == 0) return q2;
                                if(q2.size() == 0) return this;
                                
                               this.head.previous.next = q2.head.next;
                               q2.head.next.previous = this.head.previous; 
                               this.head.previous = q2.head.previous;
                               this.size+=q2.size;
                               return this;
                            }
                            public Object deleteThirdFromFront(){
                            if(size <3) throw new IllegalStateException("Empty queue");
                            Object temp =   head.next.next.next.data;
                            head.next.next.next = head.next.next.next.next;
                                head.next.next.next.previous = head.next.next;
                                size--;

                                return temp;
                            }
                            
            public Object peek2ndFromBottom(){
                            if(size <2) throw new IllegalStateException("Empty queue");
                
                return head.previous.previous.data;

            }
            public boolean comparelastElement(LinkedQueue queue){
                
if(this.size ==0 || queue.size() ==0) throw new IllegalStateException("empty");
                if(this.head.previous.data.equals(queue.head.previous.data)) {
                    return true;
                } else {
                    return false;

                }
            }
}


