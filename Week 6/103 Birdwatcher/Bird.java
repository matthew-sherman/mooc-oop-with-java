
public class Bird {
    private final String name;
    private final String latinName;
    private int observed;
    
    public Bird(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observed = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void observed(){
        this.observed++;
    }
    
    @Override
    public String toString(){
        return this.name + " (" + this.latinName + "): " + this.observed + " observations";
    }
    
}
