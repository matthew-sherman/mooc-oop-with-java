
import java.util.Scanner;


public final class Console {
    private String name;
    private String latinName;
    private String command;
    
    
    public Console(Scanner scanner, BirdDatabase db){  
        while(true){
            System.out.print("? "); 
            
            command = scanner.nextLine().trim();
            command = command.toLowerCase();

            if(command.equals("add")){
                add(scanner, db);
            }else if(command.equals("observation")){
                observation(scanner, db);
            }else if(command.equals("statistics")){
                statistics(db);
            }else if(command.equals("show")){
                show(scanner, db);
            }else if(command.equals("quit")){
                break;
            }else{
                System.out.println("Unknown command!");
            }
        }
    }
    
    private void add(Scanner scanner, BirdDatabase db){
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Latin Name: ");
        latinName = scanner.nextLine();
        
        db.addBird(name, latinName);
    }
    
    private void observation(Scanner scanner, BirdDatabase db){
        System.out.print("What was observed:? ");
        name = scanner.nextLine();
        db.observe(name);
    }
    
    private void statistics(BirdDatabase db){
        db.statistics();
    }
    
    private void show(Scanner scanner, BirdDatabase db){
        System.out.print("What? ");
        name = scanner.nextLine();
        db.show(name);
    }
}
