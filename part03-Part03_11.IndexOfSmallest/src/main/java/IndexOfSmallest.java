
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            // implement here a program that reads user input
            int input = Integer.valueOf(scanner.nextLine());
            // until the user enters 9999
            if(input == 9999){
                break;
            }
            list.add(input);
        }
        
        // after that, the program prints the smallest number
        int smallest = list.get(0);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }
        System.out.println("Smallest number: "+smallest);
        
        // and its index -- the smallest number
        // might appear multiple times
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }

        
    }
}
