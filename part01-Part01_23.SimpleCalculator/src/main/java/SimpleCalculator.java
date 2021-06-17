
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int secondNum = Integer.valueOf(scanner.nextLine());
        int addition = firstNum + secondNum;
        int substraction = firstNum - secondNum;
        int multiplication = firstNum * secondNum;
        double division = (double)firstNum / (double)secondNum;
        System.out.println(firstNum +" + "+ secondNum +" = " +addition);
        System.out.println(firstNum +" - "+ secondNum +" = " +substraction);
        System.out.println(firstNum +" * "+ secondNum +" = " +multiplication);
        System.out.println(firstNum +" / "+ secondNum +" = " +division);

    }
}
