package stack-Practice2-with-ints;

public class LinkedStack {

    class Node{
        int data;
        Node next;
        
        public Node(int data, Node next){
            this.data = data;
            this.next = next;

        }
        public Node(int data){
            this.data= data;

        }

    }


    private int size ;
         Node top;



         public void push(int data){
          
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            size++;


         }
         public int pop(){
          
            int val = top.data;
            top = top.next;
            size--;
return val;
         }
public int peek(){
return top.data;
            
         }
         public boolean isEmpty(int data){
          if(top == null ) {
            return true;
          }else{
 return false;
          }

            
         }
    
}
