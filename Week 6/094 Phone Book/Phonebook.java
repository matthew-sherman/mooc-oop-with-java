
import java.util.ArrayList;

public class Phonebook {
     private ArrayList<Person> directory;
    
    public Phonebook(){
        directory = new ArrayList<Person>();
    }
    
    public void add(String name, String number){
        this.directory.add(new Person(name, number));
    }
    
    public void printAll(){
        for(Person person : this.directory){
            System.out.println(person);
        }
    }
    
    public String searchNumber(String name){
        for(Person person : this.directory){
            if(person.getName().equals(name)){
                return person.getNumber();
            }
        }
        return "number not known";
    }
}
