
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class Team {
    private final String name;
    private final ArrayList<Player> players;
    private int maxSize;
    
    public Team(String name){
        this.name = name;
        this.players = new ArrayList<Player>();
        this.maxSize = 16;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void addPlayer(Player player){
        if(this.size() < this.maxSize){
            this.players.add(player);
        }
    }
     
    public void printPlayers(){
        for(Player player : this.players){
            System.out.println(player.toString());
        }
    }
    
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }
    
    public int size(){
        return this.players.size();
    }
    
    public int goals(){
        int goals = 0;
        
        for(Player player : this.players){
            goals += player.goals();
        }
        
        return goals;
    }
}
