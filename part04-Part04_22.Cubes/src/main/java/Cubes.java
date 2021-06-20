
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String input = scanner.nextLine();
            
            if(input.equalsIgnoreCase("end")){
                break;
            }
            int inputNum = Integer.valueOf(input);
            System.out.println(inputNum*inputNum*inputNum);
            
        }
    }
}
