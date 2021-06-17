
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumNumber = 0;
        double numberCount = 0;
        double averageNum = 0;
        while(true) {
            int number = Integer.valueOf(scanner.nextLine());
            if(number == 0){
                break;
            } else if(number > 0){
                sumNumber += number;
                numberCount++;  
            } 
            
        }
        if(numberCount == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            averageNum = sumNumber/numberCount;
            System.out.println(averageNum);
        }  

    }
}
