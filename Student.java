public class Student{

 int id;
 String rollNum;
 String Name;

 public Student(int id, String rollNum, String Name){
     this.id =  id;
     this.rollNum =  rollNum;
     this.Name =  Name;
 }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }
 
    
    
    
    
    
}