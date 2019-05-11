
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class NightSky {
    private int width;
    private int height;
    private double density;
    private int starsInLastPrint;
    
    public NightSky(double density){
        this(density, 20, 10);
    }
    
    public NightSky(int width, int height){
        this(0.1, width, height);
    }
    
    public NightSky(double density, int width, int height){
        this.width = width;
        this.height = height;
        this.density = density;
    }
    
    public void printLine(){
        Random random = new Random();
      
        for(int i = 0; i < this.width; i++){
            double randomNumber = random.nextDouble();
            if(randomNumber < this.density){
                System.out.print("*");
                this.starsInLastPrint++;
            }else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
    
    public void print(){
        this.starsInLastPrint = 0;
       
        for(int i = 0; i < this.height; i++){
            printLine();
        }
    }
    
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
