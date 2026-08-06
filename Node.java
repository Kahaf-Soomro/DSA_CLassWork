



class Teacher{

 int id;
 String Name;

 public Teacher(int id, String Name){
     System.out.println("[Teacher] Creating Teacher object...");
     this.id =  id;
     this.Name =  Name;
     System.out.println("[Teacher] Created -> id=" + this.id + ", Name=" + this.Name);
     System.out.println("[Teacher] ------------------------------");
 }
}


public class Node{
    Student std ;
    Teacher t;

    Node next;

    public Node(Student std, Teacher t){
        System.out.println("[Node] Creating Node object...");
        this.std = std;
        this.t = t;
        // next is left as null by default
        System.out.println("[Node] Node created -> std.Name=" + this.std.Name + ", t.Name=" + this.t.Name);
        System.out.println("[Node] this.next is currently = " + this.next);
        System.out.println("[Node] ------------------------------");
    }

    public static Node insert(Student stdnt, Teacher t, Node next){
        System.out.println("=== insert() called ===");
        System.out.println("[insert] Received student: " + stdnt.Name);
        System.out.println("[insert] Received teacher: " + t.Name);
        System.out.println("[insert] Received 'next' node: " + (next == null ? "null" : next.std.Name));

        if(next == null){
            System.out.println("[insert] next == null, so we create a NEW node...");
            Node newNode = new Node(stdnt, t);
            System.out.println("[insert] Created newNode: " + newNode.std.Name);
            System.out.println("[insert] Returning newNode...");
            System.out.println("=== insert() done ===");
            return newNode;
        } else {
            System.out.println("[insert] next != null, so we just OVERWRITE the existing node's data.");
            next.std = stdnt;
            next.t = t;
            System.out.println("[insert] Overwrote next -> std.Name=" + next.std.Name + ", t.Name=" + next.t.Name);
            System.out.println("[insert] Returning same node...");
            System.out.println("=== insert() done ===");
            return next;
        }
    }
}
