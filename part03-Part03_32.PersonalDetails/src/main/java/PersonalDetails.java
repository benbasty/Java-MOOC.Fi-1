
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int longest = 0;
        int averageBirth = 0;
        int sum = 0;
        int count = 0;
        String name="";
        int nameLong = 0;
        
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] parts = input.split(",");
            
            sum = sum + Integer.valueOf(parts[1]);
            count++;
            nameLong = parts[0].length();
            
            if( longest < nameLong) {
                longest = nameLong;
                name = parts[0];
            }
            
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));
     
    }
}
