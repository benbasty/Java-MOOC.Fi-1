
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int liquid1 = 0;
        int liquid1Full = 100;
        int liquid2 = 0;
        int liquid2Full = 100;
        int numberToBeAdded = 0;
        

        while (true) {
            //System.out.print("> ");
            System.out.println("First: " + liquid1 + "/" + liquid1Full);
            System.out.println("Second: " + liquid2 + "/" + liquid2Full);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                if(amount > 0){
                    liquid1 += amount;
                }
                if(liquid1 > 100) {
                    liquid1 = 100;
                }   
            }
            if(command.equals("move")){
                if(amount > 0){
                    if(amount > liquid1){
                        liquid2 += liquid1;
                        liquid1 = 0;
                    } else {
                        liquid1 -= amount;
                        liquid2 += amount;
                    }  
                }
                
                
                if(liquid2 > 100){
                    liquid2 = 100;
                }
                
            }
            if(command.equals("remove")){
                if(amount > 0){
                    liquid2 -= amount;
                }
                if(liquid2 < 0){
                    liquid2 = 0;
                }
            }

        }
    }
   

}
