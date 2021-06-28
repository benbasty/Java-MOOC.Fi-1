
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class BirdDatabase {
    private ArrayList<Bird> birdDatabase;
    
    public BirdDatabase(){
        this.birdDatabase = new ArrayList<>();
    }
    
    public void add(String name, String nameInLatin){
        Bird bird = new Bird(name,nameInLatin);
        this.birdDatabase.add(bird);
    }
    public void addObservation(String name){
        for(Bird bird: birdDatabase){
            if(bird.GetBirdName().equalsIgnoreCase(name) || bird.GetLatinBirdName().equalsIgnoreCase(name)){
                bird.observations();
                return;
            }
        }
        System.out.println("Not a bird!");
  
    }
    public void printAll(){
        for (Bird bird: birdDatabase) {           
            System.out.println(bird.toString());
        }
    }
    public void printOneBird(String name){
        for(Bird bird: birdDatabase){
            if(bird.GetBirdName().equalsIgnoreCase(name) || bird.GetLatinBirdName().equalsIgnoreCase(name)){
                System.out.println(bird.toString());
                return;
            }
        }
        System.out.println("Not a bird!");
    }
}
