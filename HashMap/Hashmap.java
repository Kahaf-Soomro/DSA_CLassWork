package HashMap;

public class Hashmap {
    private  class Entry{
        Object key;
        Object value;

            public Entry(Object key, Object value){
            this.key = key;
            this.value = value;
            
        }
    }
    


 private   int size;
private Entry[] entries = new Entry[11]; //choose  prime or odd number to get a index when break in half                 


public int hash(Object key){
return Math.abs(key.hashCode())%entries.length;


}

    public int size()
    {
        return this.size;

    }
    public Object get(Object key){
        return entries[hash(key)].value;
    }

    public Object put(Object key, Object val) throws Exception{

            for(int i = 0;i<entries.length; i++){

                
                if(  entries[((hash(key)+i) % entries.length )] == null){
                    entries[((hash(key)+i )% entries.length) ] = new Entry(key, val);
                    System.out.println("Entry put() in hashTable.");
                    ++size;
            return null;


                }
            
                
                
            } 
            throw new Exception("Entries are full ");
    }

    public Object remove(Object key){
        int hash = hash(key);
        Object temp = entries[hash].value;
        entries[hash] = null;
        --size;
        return temp;
    }
}
