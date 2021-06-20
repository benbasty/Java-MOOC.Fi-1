/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author benbasty
 */
public class Game {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;
    
    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints){
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }
    
    public String getHomeTeam(){
        return homeTeam;
    }
    
    public String getVisitingTeam(){
        return visitingTeam;
    }
    
    public int homeTeamPoints(){
        return homeTeamPoints;
    }
    
    public int visitingTeamPoints(){
        return visitingTeamPoints;
    }
    
    @Override
    public String toString(){
        return this.homeTeam + " " + this.visitingTeam + " " + this.homeTeamPoints + " " + this.visitingTeamPoints;   
    }
    
    
    
}
