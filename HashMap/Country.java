package HashMap;


public class Country{
private String name;
private String language;

private int population;



public Country (String n , String l , int p){
    name = n;
     language = l;
     population = p;

}

    @Override
    public String toString() {
        return "name : "+ name + "\n language =  " + language + "\n population= " + population ;
    }





















    public String getName() {
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    
    


    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }




    
    

}