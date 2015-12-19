import java.util.ArrayList;

/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team {
    
    private ArrayList<Leerling> lijst;
    
    public Team() {
        lijst = new ArrayList<Leerling>();
    }
    
    public void voegtoe(Leerling lid) {
        lijst.add(lid);
    }
    
    public void print() {
        System.out.println("Indeling van dit team:");
        for (Leerling lid : lijst) {
            System.out.println(lid.getNaam());
        }
        System.out.println("----------------------");
    }
    
}