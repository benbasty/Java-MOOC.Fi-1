
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        ArrayList<Game> games = readRecordsFromFile(file);
        System.out.println("Team: ");
        String team = scan.nextLine();
        int gamesPlayed = 0;
        int gamesWon = 0;
        int gamesLoss = 0;
        
        for(Game game: games) {
            if(game.getHomeTeam().equalsIgnoreCase(team) || game.getVisitingTeam().equalsIgnoreCase(team)){
                gamesPlayed++;
                if (game.getHomeTeam().equalsIgnoreCase(team)) {
                    if (game.homeTeamPoints() >= game.visitingTeamPoints()) {
                        gamesWon++;
                    } else {
                        gamesLoss++;
                    }
                }
                if (game.getVisitingTeam().equalsIgnoreCase(team)) {
                    if (game.homeTeamPoints() < game.visitingTeamPoints()) {
                        gamesWon++;
                    } else {
                        gamesLoss++;
                    }
                }
            }
            
        }
        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLoss);

    }

    private static ArrayList<Game> readRecordsFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();

        // Write here the code for reading from file
        
        try(Scanner readFile = new Scanner(Paths.get(file))){
            while(readFile.hasNextLine()){
                String line = readFile.nextLine();
                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int visitingTeamPoints = Integer.valueOf(parts[3]);
                games.add(new Game(homeTeam,visitingTeam,homeTeamPoints,visitingTeamPoints));
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        // and printing the read records
        return games;
    }

}
