
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true) {
            String string = scanner.nextLine();
            if(string.isEmpty()){
                break;
            }

            String[] parts = string.split(" ");
            for(String part: parts){
                System.out.println(part);
            }
        }
         
    }
}
