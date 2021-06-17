
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sumNumber = 0;
        int numNumber = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            } else {
                sumNumber += number;
                numNumber++;
            }
      
        }
        System.out.println("Number of numbers: "+numNumber);
        System.out.println("Sum of the numbers: "+sumNumber);
        

    }
}
