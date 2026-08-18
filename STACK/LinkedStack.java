package STACK;


public class LinkedStack {
    private int size;
    private Node top;
    private class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data = data;
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }
    public int size() {
        return size;
    }
    public Object peek() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        return top.data;
    }
    public void push(Object ob) {
        Node newNode = new Node(ob);
        newNode.next = top;
        top = newNode;
        size++;
    }
    public Object pop() {
        if (size == 0) {
            throw new IllegalStateException("Stack is empty");
        }
        Object ob = top.data;
        top = top.next;
        size--;
       return ob;
    }
   
    public ArrayStack toArrayStack(){

        ArrayStack as = new ArrayStack(size);
        Object[] tempArr = new Object[size];
        int j = this.size-1;

        while(j>=0){
             
            tempArr[j] = this.pop();
            j--;

        }
        j= 0;
        while(j<=size-1){

            as.push(tempArr[j]);
            
            j++;
        }
        return as;

        }
       
        

    
    
   

    public String toString(){
        StringBuffer result = new StringBuffer();
        Node tempTop = top;


        while (tempTop!= null){
            result.append(tempTop.data + " ");
            
        
            tempTop = top.next;

        }
        return result.toString();

    }
    public void mergeStack(LinkedStack stack1, LinkedStack Stack2){

        Object[] tempStack = new Object[stack1.size];

        Node tempTop = stack1.top;

int i = stack1.size-1;

        while (tempTop!= null && i>=0){
           
            tempStack[i] = tempTop.data;

            tempTop = tempTop.next;
            i--;

        }
        i = tempStack.length-1;
         
        while(i>=0){
            Stack2.push(tempStack[i]);
            i--;

        }

    }

}
