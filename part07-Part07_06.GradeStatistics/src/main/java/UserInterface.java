
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class UserInterface {
    private Scanner scanner;
    private GradeStatistics statistics;
    
    public UserInterface(Scanner scanner, GradeStatistics statistics) {
        this.scanner = scanner;
        this.statistics = statistics;
    
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while(true) {
            int point = Integer.valueOf(scanner.nextLine());
            if(point == -1){
                break;
            }
            if(point >= 0 && point <= 100){
                this.statistics.add(point);
            }
            
        }
        System.out.println("Point average (all): " + this.statistics.pointsAverage());
        
        if(this.statistics.pointsAveragePassing() != 0){
            System.out.println("Point average (passing): " + this.statistics.pointsAveragePassing());
        } else {
            System.out.println("Point average (passing): -");
        }
        
        System.out.println("Pass percentage: " + this.statistics.passingPercentage());
        System.out.println("Grade distribution: ");
        this.statistics.GradeDistribution();
    }
    
}
