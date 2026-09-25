package BeforeExam;

public class LinkedList {
    class Node{


        int data;
        Node next;
public Node (int data ){
    this.data = data;

}
public Node(int data ,Node n)
{
    this.data = data;
    this.next = next;

}



    }
    

    Node head;
    int size;
    int size(){return size;} 
  boolean  isEmpty(){
        return size==0;

    }
    public void insertAtBeginning(int obj){
      
        Node newHead = new Node(obj);
        newHead.next = head;
        head = newHead;


       size++;
    }
    public void insertAtEnd(){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;

        }
        temp.next = newNode(data);
        
    }
}
