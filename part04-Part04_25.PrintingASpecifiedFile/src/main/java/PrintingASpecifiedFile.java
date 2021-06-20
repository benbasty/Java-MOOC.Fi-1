
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");
        String contentFile = scanner.nextLine();
        
        try (Scanner readFile = new Scanner(Paths.get(contentFile))){
            while(readFile.hasNextLine()){
                String line = readFile.nextLine();
                System.out.println(line);
            }
        } catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }

    }
}
