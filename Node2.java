public class Node2 {
    int x ;
    Node2 next;
    public Node2(int x){
        this.x = x;

    }
       public Node2(int x,  Node2 start){
        this.x = x;
        this.next = start;

    }
    public static Node2 insert(Node2 n ,int x){
        if(n == null || n.x > x){

            n = new Node2(x, n);
            return n;

            

        }    
        Node2 p = n;
        while(p.next != null){
            if(p.next.x > x) break;
            p = p.next;
            
                
            
    
        }
        p.next = new Node2(x, p.next);
        return n;

    }
}
