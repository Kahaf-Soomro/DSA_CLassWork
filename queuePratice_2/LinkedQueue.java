package queuePratice_2;

import STACK.LinkedStack;

public class LinkedQueue {
    private int size = 0;
    class Node{
        Object data;
        Node previous = this;
        Node next = this;
        public Node (Object d){
            this.data = d;

        }
        public Node (Object data, Node prev, Node next){
            this.data = data;
            this.previous = prev;
            this.next = next;

        }

    }
        //dummy node
        Node head = new Node(null);

        public int size(){ return size;}
        public boolean isEmpty(){ return size==0;}


        //add
        public void Add(Object obj){

            head.previous.next = new Node(obj);
            head.previous = head.previous.next;
            size++;

            //or just head.previous.next = new Node(obj, head.previous, head)
        }

            public Object remove(){
                if(size == 0) throw new IllegalStateException("empty queue");
                Object removed = head.next.data;
            head.next = head.next.next;
                head.next.previous = head;
                --size;

                return removed;


            }   
            @Override 

            public String toString(){
                
                StringBuffer strB = new StringBuffer();
                
                int SIZE = this.size;
                Node temp = head.next;
                for(int i = 0; i<=SIZE; i++){
                    strB.append(temp.next.data);
                    temp = temp.next;

                }
                return strB.toString();
            }

                public String toStringReverse(){
                    StringBuffer strB = new StringBuffer();
                    int SIZE  = this.size;
                    Node temp = head.previous;
                    for(int i = 0; i<size; i++){
                        strB.append(temp.previous.data);
                        temp = temp.previous;
                    }
                    return strB.toString();
                }

                public boolean equals(LinkedQueue q){
                    if(this.size()!=q.size()){
                        return false;
                    }
                    int fSIZE = this.size();
                    Node temp1 = this.head.next;
                    Node temp2 = q.head.next;
                    for(int i= 0; i<fSIZE; i++){
                        if(!temp1.data.equals(temp2.data)){
                            return false;

                        }
                       
                        temp1 = temp1.next;
                        temp2 = temp2.next;

                    }
                    return true;

                }

                public Object[] toArray(){

                        if(size == 0) return null;

                        int SIZE = this.size();
                        Node temp = head.next;
                        Object[] arr = new Object[SIZE];
                        for(int i = 0; i<SIZE; i++){
                            arr[i] = temp.data ;
                            temp = temp.next;
                        }
                        return arr;

                }
                public Object[] toArray(int start, int end) {
                    if(this.size() ==0) return null;
                    int width = end-start;
                    Object[] arr = new Object[width];
                    Node temp = head.next;
                    for(int i = 0; i<start; i++){
                        temp = temp.next;

                    }
                    for(int i = 0; i <width; i++){
                        
                        arr[i] = temp.data;
                        temp = temp.next;
                    }
                    return arr;
                                                            }

                
                    public Object[] lastN(int n) throws Exception{
                        if(this.size() ==0) return null;
                        if(n>this.size()) {
                            throw new Exception("Too big of a input, The queue only has " + this.size() + " entries. ");
                        }
                        Object[] arr = new Object[n];
                        Node temp = head.previous;
                        for(int i = n; i>=0; i--){
                            arr[i] = temp.data;
                            temp = temp.previous;

                        }
                        return arr;

                    }


                    public LinkedStack toLinkedQueue(){
                        
                        
                    }
    
}
