package HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
 


        Hashmap hm = new Hashmap();
        hm.put("R",new Country("Russia", "Russian", 4000000));
        hm.put("E", new Country("england", "english", 10000000));
        hm.put("D",  new Country("Deutscland", "German", 12000000));
        hm.put("P", new Country("Poland", "Polish", 20000000));
        hm.put("H",new Country("Hungary", "Hangarian", 4000000));
        hm.put("N", new Country("Netherlands", "Dutch", 5700000));

System.out.println(
        hm.get("H") 
        +"\n"+ hm.hash("H")

);
    }
    
}
