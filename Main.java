public class Main {
    public static void main(String[] args) {



Node2 start1 = new Node2(10);



start1 = Node2.insert(start1, 20);
start1 = Node2.insert(start1, 30);
start1 = Node2.insert(start1, 40);
start1 = Node2.insert(start1, 50);

Node2 start2 = new Node2(5);



start2 = Node2.insert(start2, 15);
start2 = Node2.insert(start2, 25);
start2 = Node2.insert(start2, 35);
start2 = Node2.insert(start2, 67);


// start.ReplaceFromSortedAscending(start, 20, 60);
// start.deleteFromSortedAscending(start, 40);


    if (start1 == null) {
        System.out.println("Empty List ");
        return;
    }

    for (Node2 p = start1; p != null; p = p.next) {
        System.out.print(p.x + " -> ");
    }
    System.out.println("null");


    if (start2 == null) {
        System.out.println("Empty List");
        return;
    }

    for (Node2 p = start2; p != null; p = p.next) {
        System.out.print(p.x + " -> ");
    }
    System.out.println("null");


            //create new list combining these 2,


           Node2 start3 = null;
           




while(start1!=null && start2!=null)
{
    System.out.println("Inserting elements");
  start3=  Node2.insert(start3, start1.x);
    start3 = Node2.insert(start3, start2.x);
    start1 = start1.next;
    start2 = start2.next;

}
  if (start3 == null) {
        System.out.println("Empty List ");
        return;
    }

    for (Node2 p = start3; p != null; p = p.next) {
        System.out.print(p.x + " -> ");
    }
    System.out.println("null");





    //     Student s1 = new Student(0,"43","Std 1");
    //     System.out.println("std created");
    //     Student s2 = new Student(0,"44","Kahaf");
    //     System.out.println("std created");


    //     Student s3 = new Student(0,"45","Std 3");
    //     System.out.println("std created");

    //     Student s4= new Student(0,"46","Std 4");
    //     System.out.println("std created");

    //     Student s5 = new Student(0,"47","Haseeb");
    //     System.out.println("std created");

    //     NodeStudent start = new NodeStudent(s1);
    //     NodeStudent tail = start;
    //     tail.next = new NodeStudent(s2);
    //     tail = tail.next;
    //     tail.next = new NodeStudent(s3);
    //  tail = tail.next;
    //     tail.next = new NodeStudent(s4);
    //          tail = tail.next;
    //     tail.next = new NodeStudent(s5);

    //     String name = "Haseeb";
    //     boolean isFound = false;
    //     NodeStudent tempCurrentNode = start;
    //     while(tempCurrentNode!=null){
    //         System.out.println("Loop running => "+  tempCurrentNode.data.Name);
    //     if(    tempCurrentNode.data.Name.equals(name)){
    //         isFound = true;

    //         break;

    //     }
    //     tempCurrentNode = tempCurrentNode.next;

    // }
    // if(isFound){
    //     System.out.println("Result: "  + name );
    // }else{
    //     System.out.println("No results");
    // }

     
}
}
