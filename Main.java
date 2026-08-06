public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(0,"43","Std 1");
        System.out.println("std created");
        Student s2 = new Student(0,"44","Kahaf");
        System.out.println("std created");


        Student s3 = new Student(0,"45","Std 3");
        System.out.println("std created");

        Student s4= new Student(0,"46","Std 4");
        System.out.println("std created");

        Student s5 = new Student(0,"47","Haseeb");
        System.out.println("std created");

        NodeStudent start = new NodeStudent(s1);
        NodeStudent tail = start;
        tail.next = new NodeStudent(s2);
        tail = tail.next;
        tail.next = new NodeStudent(s3);
     tail = tail.next;
        tail.next = new NodeStudent(s4);
             tail = tail.next;
        tail.next = new NodeStudent(s5);

        String name = "Haseeb";
        boolean isFound = false;
        NodeStudent tempCurrentNode = start;
        while(tempCurrentNode!=null){
            System.out.println("Loop running => "+  tempCurrentNode.data.Name);
        if(    tempCurrentNode.data.Name.equals(name)){
            isFound = true;

            break;

        }
        tempCurrentNode = tempCurrentNode.next;

    }
    if(isFound){
        System.out.println("Result: "  + name );
    }else{
        System.out.println("No results");
    }

     
}
}
