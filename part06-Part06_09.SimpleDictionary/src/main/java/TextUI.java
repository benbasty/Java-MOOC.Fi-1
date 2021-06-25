/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
import java.util.ArrayList;
import java.util.Scanner;


public class TextUI {
    private Scanner scanner;
    private SimpleDictionary simpleDictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary ) {
        this.scanner = scanner;
        this.simpleDictionary = dictionary;
    }
    
    public void start() {
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("end")){
                System.out.println("Bye bye!");
                break;
            } else if(command.equalsIgnoreCase("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                this.simpleDictionary.add(word, translation);
                continue;
            } else if(command.equalsIgnoreCase("search")){
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String finalTranslation = this.simpleDictionary.translate(toBeTranslated);
                if(finalTranslation == null){
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.println("Translation: " + finalTranslation) ;
                }
                
                continue;
            } else {
                System.out.println("Unknown command");
                continue;
            }
        }
    }
    
}
