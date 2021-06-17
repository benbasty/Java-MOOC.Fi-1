
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumNumber = 0;
        double numberCount = 0;
        double averageNum = 0;
        while(true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            } else {
                sumNumber += number;
                numberCount++;
                averageNum = sumNumber / numberCount;
            }
      
        }
        System.out.println("Average of the numbers: "+averageNum);
    }
}
