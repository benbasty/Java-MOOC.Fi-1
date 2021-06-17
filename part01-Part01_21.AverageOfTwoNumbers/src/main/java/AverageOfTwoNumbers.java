
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double secondNum = Integer.valueOf(scanner.nextLine());
        double sum = firstNum + secondNum;
        double average = sum / 2;
        System.out.println("The average is "+ average);

    }
}
