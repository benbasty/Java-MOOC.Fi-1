
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            count++;
            list.add(input);
        }
        
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum = 0;
        double average = 0;
        
        for(Integer num : list){
            sum += num;
            average = (double) sum / count;
        }
        System.out.println("Average: "+average);
        
    }
}
