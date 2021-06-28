
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scan.nextLine();
        ArrayList<Recipe> recipes = readRecipesFromFile(file);
        
        System.out.println("Commands:\nlist - lists the recipes\nstop - stops the program\nfind name - searches recipes by name\nfind cooking time - searches recipes by cooking time\nfind ingredient - searches recipes by ingredient");
        
        while(true){
            System.out.print("Enter command: ");
            String command = scan.nextLine();
            
            if(command.equals("stop")){
                break;
            }
            //list command
            if (command.equalsIgnoreCase("list")) {
            System.out.println("Recipes:");
            for (Recipe recipe : recipes) {
                System.out.println(recipe.toString());
            }
            System.out.println("");
            }
            
            //find name command
            if (command.equalsIgnoreCase("find name")) {
                System.out.print("Searched word: ");
                String searchedWord = scan.nextLine();
                System.out.println("Recipes:");
                for (Recipe recipe : recipes) {
                    if(recipe.getName().contains(searchedWord)){
                        System.out.println(recipe.toString());
                    }
                }
            
            }
            //cooking time command
            if(command.equalsIgnoreCase("find cooking time")){
                System.out.print("Max cooking time: ");
                int maxCookingTime = Integer.valueOf(scan.nextLine());
                System.out.println("Recipes:");
                for(Recipe recipe: recipes){
                    if(recipe.getCookingTime() <= maxCookingTime){
                        System.out.println(recipe.toString());
                    }
                }
            }
            
            //find ingredient coomand
            if(command.equalsIgnoreCase("find ingredient")){
                System.out.print("Ingredient: ");
                String ingredient = scan.nextLine();
                System.out.println("Recipes:");
                for(Recipe recipe: recipes){
                    if(recipe.getIngredients().contains(ingredient)){
                        System.out.println(recipe.toString());
                    }
                }
            }
            
        }

    }
    
    
    
    public static ArrayList<Recipe> readRecipesFromFile(String filename){
        ArrayList<Recipe> recipes = new ArrayList<>();
        ArrayList<String> recipeParts = new ArrayList<>();
        String recipeName;
        int recipeTime;
        try(Scanner fileReader = new Scanner(Paths.get(filename))){
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                if(!line.isEmpty()){
                    recipeParts.add(line);
                } else {
                    recipeName = recipeParts.get(0);
                    recipeTime = Integer.valueOf(recipeParts.get(1));
                    recipeParts.remove(0);
                    recipeParts.remove(0);
                    recipes.add(new Recipe(recipeName, recipeTime, recipeParts));
                    recipeParts.clear();
                }
            }
                if(!recipeParts.isEmpty()){
                    recipeName = recipeParts.get(0);
                    recipeTime = Integer.valueOf(recipeParts.get(1));
                    recipeParts.remove(0);
                    recipeParts.remove(0);
                    recipes.add(new Recipe(recipeName, recipeTime, recipeParts));
                    recipeParts.clear();
                }
            
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

}
