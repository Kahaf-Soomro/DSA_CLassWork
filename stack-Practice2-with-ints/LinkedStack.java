package stack-Practice2-with-ints;

import com.sun.jdi.connect.Connector;
import java.util.LinkedList;

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

    public int size(){
        return size;
    }

         public void push(int data){
          
            Node newNode = new Node(data);
            newNode.next = top;
            top = newNode;
            size++;


         }
         public int pop(){
          if(top == null){
            System.out.println("Empty stack");
            return 0;

          }
            int val = top.data;
            top = top.next;
            size--;
return val;
         }
public int peek(){
return top.data;
            
         }
         public boolean isEmpty(){
          if(top == null ) {
            return true;
          }else{
 return false;
          }

            
         }


            public boolean equals(LinkedStack ls){
                if(this.size() != ls.size()) return false;
                LinkedStack temp = this;
                LinkedStack temp2 = ls;
                int SIZEE = this.size();
                boolean isEquals = true;
            
                int[] data1 = new int[this.size()];
                int[] data2 = new int[ls.size()];

                for(int i = SIZEE-1; i>=0; i--)

                    {
                    int val1 = temp.pop();
                    int val2  =temp2.pop();
                    data1[i] = val1;
                    data2[i] = val2;
                        if(val1!= val2){
                             System.out.println("Inequality found: " + val1 + " != " + val2);
                            isEquals = false;
                        }
                       

                    }
                    for(int i =0; i<=SIZEE-1;  i++){

                    this.push(data1[i]);
                    ls.push(data2[i]);
                

                }
                return isEquals;
            }

            public boolean search(int data){
              
                int counter = 0;
                Node current = top;
                while(current != null){
                    if(current.data == data){
                      return true;
                      
                    }
                    current = current.next;
                }
                        
                        return false;
                
            }
            public void display(){
                Node current = top;
                while(current != null){
                    System.out.println(current.data);
                    current = current.next;
                }
            }
            public void reverse(){

                // if(top == null){
                //     System.out.println("Cant reverse empty list");

                // }
                // int SIZE = this.size();
                // int[] valArr = new int[SIZE];
                // for(int i = 0; i <= SIZE-1; i++ ){
                //             valArr[i] = this.pop();

                // }
                // for(int i = 0; i <= SIZE-1; i++ ){
                //     this.push(valArr[i]) ;

                // }






                Node prev, current, next;
                current = top;
                prev = null;
                while(current!=null){
                        next = current.next;
                        current.next = prev;

                        prev = current;
                        current = next;

                    }
                    top = prev;
                
            }

            public void mergeStacks(LinkedStack s1, LinkedStack s2){
                int size2 = s2.size();
                int[] s2Data = new int[size2];

                for(int i = 0; i<=size2-1; i++){
                    // if(s2.peek()!= null){

                        s2Data[i] = s2.pop();
                    // }
                }
                for(int j = 0; j<=s2Data.length-1; j++)
                {
                    s1.push(s2Data[j]);
                }
                System.out.println("Merged stack 2 with Stack 1");
            
                }
                    public void mergeStacks_noDestroy(LinkedStack s1, LinkedStack s2){

                        int stack1Size = s1.size();
                        Node tempTop = s1.top;
                    Object[] tempStackData = new Object[stack1Size];


                        int i = stack1Size-1;
                        while(tempTop!=null && i>=0){
                            

                            tempStackData[i] =tempTop.data;

                            tempTop = tempTop.next;
                            
                            i--;
                        }
                        i = stack1Size-1;

                        while(i>=0){
                            s2.push( (int) tempStackData[i]);
                            i--;
                        }
                    }



       
}
