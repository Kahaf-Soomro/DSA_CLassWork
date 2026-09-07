package LinkedList;

 class Node{
        Object value;
        Node next;

       public Node(Object value){
        this.value =value;

       } public Node(Object value, Node next){
        this.value =value;
        this.next = next;


       }
       private int size = 0;
       


       //display
       public void display(Node head){

        for(Node current = head; current !=null; current = current.next){
            System.out.println(current.value );
        }

       }
       public boolean search(Node head, Object value)
       {
        for(Node current = head; current!= null; current = current.next){
            if(current.value.equals(value)) return true;
            
        }
        return false;

       }

       public int size(Node head){
        int count = 0;
        for(Node current = head; current!=null ; current = current.next){
            count++;
        }
        return count;

       }
       public int size(){

        return this.size;
       }



       public Object getLast(Node head){
        if(head ==null) return null;
        Node current = head;
      while(current.next!=null){
        current = current.next;
      }
       
      return current.value;
    }
        

    public int sum(Node head){
        int Sum = 0;
        Node current = head;
        while(current!=null){
         Sum+=  (int) current.value ;
            current = current.next;

        } 
        return Sum;
    }



//insert methods
public Node insertAtEnd(Node head, Object value){
    if(head == null){
        head = new Node(value);
        return head;
    }
    else{

        Node c = head;
        while(c.next!=null){
            c = c.next;
            
        }
        c.next = new Node(value);
        return head;
    }




}

public Node insertAtBeginning(Node head, Object value){
   

   
        Node newHead = new Node(value, head);
        return newHead;
}

public Node insertAfter(Node head, Object afterValue, Object newValue){


    if(head ==null){
       System.out.println("List is empty.");
        return head;
    }

    // The Commented code is not necessary 
    // else if(head.value == afterValue){
    //     head.next = new Node(newValue, head.next);
    //     return head;
    // }
    else{
        for(Node current = head; current!=null; current=current.next){
            if(current.value.equals(afterValue)){
                current.next = new Node(newValue, current.next);
                break;
            }
            
        }
        return head;    
    }


    
}

public Node insertAtPosition(Node head, int position, Object value){
if(head ==null){
    System.out.println("List is empty");
    return head;
}
if(position == 0){
     head = new Node(value, head);
    return head; 
} else {
    Node current = head;
            for(int i = 1; i<position; i++){
                current = current.next;
               
            }
            current.next = new Node(value, current.next);

}

    return head;
}

//The Go to insert vmethod for numbers only
public Node insert(Node head, int value){

        if(head ==null){
            head = new Node(value);
            return head;

        }
        if ( (int) head.value > value){
            head = new Node(value ,head);
            return head;
        }
        Node current = head;
      while(current.next!=null){
        if((int) current.next.value > value){
            break;
        }
        current = current.next;
    }
    current.next = new Node(value , current.next);


    return head;



}
public Node deleteUnsorted(Node head, Object value){
    if(head ==null){
        System.out.println("List empty, nothing to delete");
        return head;

    }
    if(head.value == value){
        System.out.println("Deleted the node in O(1).");
        head = head.next;

        return head;
    }


        for(Node current = head; current.next!=null ; current=current.next){
            if(current.next.value == value){
                current.next = current.next.next;
                return head;

            }
        
        }
                return head;

    }



    public Node deleteSortedAscending(Node head,  Object  value ){
        
          if(head ==null){
        System.out.println("List empty, nothing to delete");
        return head;

    } else if(head.value == value ){
        head = head.next;
        return head;

    }
    else 
    {
        for(Node current =  head; current.next!=null; current = current.next ){

            if(current.next.value.equals(value)){
                
                current.next = current.next.next;
             return head;

            }

              if((int) current.next.value > (int) value){
                
                current.next = current.next.next;
             return head;

            }




        }

        
        return head;
    }


    }


     public Node deleteSortedDescending(Node head,  Object  value ){
           if(head ==null){
        System.out.println("List empty, nothing to delete");
        return head;

}
if(head.value.equals(value)) {
    head = head.next;
    return head;

}     
for(Node c = head; c!=null; c=c.next){
    if(c.next.value.equals(value)){

        c.next  = c.next.next;
        return head;


    }
    if((int) c.next.value < (int) value){
break;

    }
}
return head;
}

//Merge Lists
public Node mergeListsSorted(Node head1, Node head2){

     if(head1 ==null){
        return head2;
    }
if(head2 ==null){
        return head1;
    }
    if(head1.size() < head2.size()){
        Node c1 = head1;
        Node c2 = head2;
    for(c1 = head1; c1!=null; c1= c1.next){

        //take head1 to traverse and insert
        if((int) c2.value > (int) c1.value){
          
                c2.next = new Node(c1.value, c2.next);
              

        }else{
            //skip the iteration
        }
    }

    } else{
        //take head2 to traverse and insert
              Node c1 = head1;
        Node c2 = head2;
    for(c2 = head1; c2!=null; c2= c2.next){

        //take head1 to traverse and insert
        if((int) c1.value > (int) c2.value){
          
                c1.next = new Node(c2.value, c1.next);
              

        }else{
            //skip the iteration
        }
    }

    }

    return head1;
}


public Node mergeListsUnsorted_chatgptMethod(Node head1, Node head2){
    if(head1 ==null){
        return head2;
    }
if(head2 ==null){
        return head1;
    }
    Node c1 = head1;
    Node c2 = head2;
    Node result     = null;
    Node tail = null;
    while(c1!=null && c2!=null){
            if((int) c1.value < (int) c2.value){
            if(result ==null){
                result = c1;
                tail  = c1;

            }
            else {
               tail.next = c1;
               tail = c1;

                

               
            }
            c1 = c1.next;

        } else{
              if(result ==null){
                result = c2;
                tail  = c2;

            }
            else {
               tail.next = c2;
               tail = c2;

                

        }
            
        }
        c2 = c2.next;

     }
   
  if(c1 != null)
        tail.next = c1;

    if(c2 != null)
        tail.next = c2;

    return result;
}



//reverse 

public Node reverseWithArray(Node head){
    if(head == null){
        return null;

}

    if(head.next ==null){
        return head;
    }
    
    Object[] arr = new Object[head.size()];
    int i = 0;
    for(Node c= head; c!=null; c= c.next){
        arr[i] = c.value;
        ++i;
    }

    Node c = head;
    --i;    
    while(i>=0 && c!=null){
            c.value = arr[i];
            c = c.next;


        i--;
    }
    return head;

}

//count occurences 
 public int countFrequency(Node head, Object value){
int count = 0;
if(head == null) return 0;

    Node counter = head;
    for(counter = head; counter!=null; counter = counter.next){
        if(counter.value.equals(value)){
            count++;

        }
    }



    return count;
 }

    public Node findMax(Node head){

        if(head == null){

            return null;
        } 
        
            Node max = head;
            for(Node current = head.next; current!= null; current = current.next){
                if( (int) max.value < (int) current.value){
                    max = current;
                }
            }
            return max;

    }
     public Node findMin(Node head){

        if(head == null){

            return null;
        } 
        
            Node min = head;
            for(Node current = head.next; current!= null; current = current.next){
                if( (int) min.value > (int) current.value){
                    min = current;
                  
                }
            }
            return min;

    }
    


  

    }


    
public class LinkedList {
    

     


        public static  void main(String[] args) {
            
            Node third = new Node(30);
            Node second = new Node(20,third);
            Node first = new Node(10, second);
            
            // first
            //  ↓
            // 10 → 20 → null
        


              System.out.println(  first.getLast(first));

}



 
}
