
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
public class Recipe {
    private String name;
    private int cookingTime;
    private ArrayList<String> ingredients = new ArrayList<>();
    
    public Recipe(String name, int cookingTime, ArrayList<String> ingredients){
        this.name = name;
        this.cookingTime = cookingTime;
        for(String ingredient : ingredients){
            this.ingredients.add(ingredient);
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getCookingTime(){
        return this.cookingTime;
    }
    
    public ArrayList<String> getIngredients() {
        return this.ingredients;
    }
    
    public String toString(){
        return this.getName() + ", cooking time: " + this.getCookingTime();
    }
    
    
}
