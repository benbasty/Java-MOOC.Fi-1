
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class UserInterface {
    
    private Scanner scanner;
    private BirdDatabase birdDatabase;
    
    public UserInterface(Scanner scanner, BirdDatabase birdDatabase){
        
        this.scanner = scanner;
        this.birdDatabase = birdDatabase;
    }
    
    public void start(){
        while(true){
            System.out.print("? ");
            String command = scanner.nextLine();
            
            if(command.equalsIgnoreCase("quit")){
                break;
            } else if(command.equalsIgnoreCase("Add")){
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Name in Latin: ");
                String nameInLatin = scanner.nextLine();
                this.birdDatabase.add(name, nameInLatin);   
            } else if(command.equalsIgnoreCase("Observation")){
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                this.birdDatabase.addObservation(birdName);
            } else if(command.equalsIgnoreCase("All")){
                this.birdDatabase.printAll();
            } else if(command.equalsIgnoreCase("One")){
                System.out.print("Bird? ");
                String birdName = scanner.nextLine();
                this.birdDatabase.printOneBird(birdName);
            } else {
                System.out.println("Not a valid command!!");
            }
            
        
        }
    
    }
    
}
