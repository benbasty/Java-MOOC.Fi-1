/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class Bird {
    private String birdName;
    private String latinBirdName;
    private int count;
    
    public Bird(String birdname, String latinBirdName){
        this.birdName = birdname;
        this.latinBirdName = latinBirdName;
        this.count = 0;
    }
     public String GetBirdName(){
         return this.birdName;
     }
     public String GetLatinBirdName(){
         return this.latinBirdName;
     }
     public int getCount(){
         return this.count;
     }
     public void observations(){
         this.count++;
     }
     public String toString(){
         return this.birdName+ " (" + this.latinBirdName+ "): " + this.count + " observations";
     }
    
}
