package LinkedList;


public class LinkedList<U> {
    

    public class Node<U>{
        U data;
        Node next;

       public Node(U data1){
        this.data =data1;

       }

        
    }
public    LinkedList(){

    }




    public static void main(String[] args) {
        LinkedList<String> LL = new LinkedList<String>();
    }
}
