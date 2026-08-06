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


    Node2 deleteFromUnSorted(Node2 start, int x)
    {
        if(start == null) return start;
        if(start.x ==x )
            {
                return start.next;}

       for(Node2 p = start; p.next!=null; p = p.next)
       {

        // following loop is for ascending ordered list
//             if(p.next.x > x){
// break;
//             }
            if(p.next.x == x){
                p.next = p.next.next;
                break;
                
            }
        }
       return start;
    }

  Node2 deleteFromSortedAscending(Node2 start, int x)
    {
        if(start == null) return start;
        if(start.x ==x )
            {
                return start.next;}

       for(Node2 p = start; p.next!=null; p = p.next)
       {

            if(p.next.x > x){
break;
            }
            if(p.next.x == x){
                p.next = p.next.next;
                break;
                
            }
       }
       return start;
    }
  Node2 deleteFromSortedDescending(Node2 start, int x)
    {
        if(start == null) return start;
        if(start.x ==x )
            {
                return start.next;}

       for(Node2 p = start; p.next!=null; p = p.next)
       {

            if(p.next.x < x){
break;
            }
            if(p.next.x == x){
                p.next = p.next.next;
                break;
                
            }
       }
       return start;
    }




// replace
 Node2 ReplaceNodeFromUnSorted(Node2 start,int x, int y)
    {
        if(start == null) return start;
        if(start.x ==x )
            {
                start.x = y;
                return start.next;}

       for(Node2 p = start; p.next!=null; p = p.next)
       {

        // following loop is for ascending ordered list
//             if(p.next.x > x){
// break;
//             }
            if(p.next.x == x){
                p.next.x = y;

                p.next = p.next.next;
                break;
                
            }
        }
       return start;
    }

  Node2 ReplaceFromSortedAscending(Node2 start, int x, int y)
    {
        if(start == null) return start;
        if(start.x ==x )
            {
                start.x =y;

                return start.next;}

       for(Node2 p = start; p.next!=null; p = p.next)
       {

            if(p.next.x > x){
break;
            }
            if(p.next.x == x){
                p.next.x = y;

                p.next = p.next.next;
                break;
                
            }
       }
       return start;
    }
  Node2 ReplaceFromSortedDescending(Node2 start, int x , int y)
    {
        if(start == null) return start;
        if(start.x ==x )
            {
                start.x = x;

                return start.next;}

       for(Node2 p = start; p.next!=null; p = p.next)
       {

            if(p.next.x < x){
break;
            }
            if(p.next.x == x){
                p.next.x = y;
                
                p.next = p.next.next;
                break;
                
            }
       }
       return start;
    }

    }