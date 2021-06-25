/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if(command.equalsIgnoreCase("stop")){
                break;
            } else if(command.equalsIgnoreCase("add")){
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.todoList.add(toAdd);
            } else if(command.equalsIgnoreCase("list")){
                todoList.print();
            } else if(command.equalsIgnoreCase("remove")){
                System.out.print("Which one is removed? ");
                int id = Integer.valueOf(scanner.nextLine());
                todoList.remove(id);
            } 
            
        }
    }
    
}
