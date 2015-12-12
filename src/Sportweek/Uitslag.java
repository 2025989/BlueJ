package Sportweek;

/**
 * Write a description of class Uitslag here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Uitslag {
    
    //attributes
    private Team team1;
    private Team team2;
    
    //Constructor
    public Uitslag(Team team1, Team team2) {
        this.team1 = team1;
        this.team2 = team2;
    }
    
    //******************** methods ********************//
    public String toString() {
        return String.format("%02d - %02d", team1.getScore(), team2.getScore());
    }
    //*************************************************//
    
}