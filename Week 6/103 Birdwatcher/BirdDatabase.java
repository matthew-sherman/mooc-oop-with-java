
import java.util.ArrayList;


public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase(){
        birds = new ArrayList<Bird>();
    }
   
    public void addBird(String name, String latinName){
        Bird bird = new Bird(name, latinName);
        birds.add(bird);
    }
    
    public void observe(String name){
        for (Bird bird : this.birds){
            if(bird.getName().equals(name)){
                bird.observed();
            }
        }
        System.out.println("Is not a bird!");
    }
    
    public void statistics(){
        for(Bird bird: this.birds){
            System.out.println(bird.toString());
        }
    }
    
    public void show(String name){
        for(Bird bird: this.birds){
            if(bird.getName().equals(name)){
                System.out.println(bird.toString());
            }
        }
    }
}
