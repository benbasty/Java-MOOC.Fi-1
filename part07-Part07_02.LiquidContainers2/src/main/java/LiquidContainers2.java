
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        //while (true) {
            //System.out.print("> ");

            //String input = scan.nextLine();
            //if (input.equals("quit")) {
            //    break;
            //}

        //}
        Container container1 = new Container();
        Container container2 = new Container();
        UserInterface ui = new UserInterface(container1, container2, scan);
        ui.start();
        
        
    }

}
