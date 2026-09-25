package BeforeExam.stack;

public class LinkedStack {
    class Node{
        Object data; 
        Node next;
        public Node(Object data){
            this.data = data;

        }
             public Node(Object data, Node next){
            this.data = data;
            this.next = next;


        }
    }


        private int size = 0;
        Node top ;

            public int size(){
                return size;
            }

            public void push(Object obj){
             
                  Node temp= new Node(obj);
                    temp.next = top;
                    top = temp;

                    size++;


                
            }
            public Object pop(){
                if(size ==0) throw new IllegalStateException("Empty list");
                
                Object popped = top.data;
                top = top.next;
                size--;
                return popped;



            }
    
            public Object peek(){
                if(size ==0) throw new IllegalStateException("Empty list");

                return top.data;
            }
            
            public boolean Search(Object o){

                if(size ==0) throw new IllegalStateException("Empty list");
                
                Node tempTop = top;
                while(tempTop!=null){
                   if(tempTop.data.equals(o)) return true; 
                    tempTop = tempTop.next;
                }
                return false;

            }
            public Object peek2ndLast(){
                if(size<2) throw new  IllegalStateException("List smaller than 2 elements");
                
                Node tempTop = top;
                while(tempTop.next.next!= null){

                    tempTop = tempTop.next;

                }
                return tempTop.data;

            }
            public boolean bottomEquals(LinkedStack stack) {


                if(this.size ==0 || stack.size==0) return false;
                Node temp1 = this.top;
                Node  temp2 = stack.top;
                while(temp1.next!=null){
                    temp1 = temp1.next;

                }
                  while(temp2.next!=null){
                    temp2 = temp2.next;
                    
                }
        return temp1.data.equals(temp2.data);

}

public Object peek2ndFromTop() {
                if(size<2) throw new  IllegalStateException("List smaller than 2 elements");

                return top.next.data;

}
public LinkedStack[] StackHalfer() {
                if(size<2) throw new  IllegalStateException("List smaller than 2 elements");

                LinkedStack[] ls = new LinkedStack[2];
ls[0] = new LinkedStack();
ls[1] = new LinkedStack();
                int h = size/2;
                Node temp = top;
                for(int i = h-1; i>=0; i--){
                 ls[0].push(temp.data);
                 temp = temp.next;
                }
                while(temp!=null) {
                    ls[1].push(temp.data);
                    temp = temp.next;
                }
                return ls;
            

              
}
public LinkedStack merge(LinkedStack l1){
                        if(size() ==0) return l1;
                        if(l1.size() ==0) return this;
                        Node temp = l1.top;
                        while(temp.next!=null)
                        {
                            temp = temp.next;

                        }
                        temp = this.top;
                        return l1;

        

    }

public Object getMiddle(){
                if(size ==0) throw new IllegalStateException("Empty list");

              int h = size/2;
              Node temp = top;
            for(int i = 1; i<h; i++ )

                {
                    temp = temp.next;

                }
                return temp.data;
            }
}
    

