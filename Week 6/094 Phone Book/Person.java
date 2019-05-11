/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author matthew
 */
public class Person {
    private String name;
    private String number;
    
    public Person(String name, String number){
        this.name = name;
        this.number = number;
    }
    
    public void changeNumber(String newNumber){
        this.number = newNumber;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getNumber(){
        return this.number;
    }
    
    @Override
    public String toString(){
        return this.name + " number: " + this.number;
    }
}
