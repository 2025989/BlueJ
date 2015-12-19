import javax.swing.*;

/**
 * Write a description of class SportFrame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SportFrame extends JFrame {
    
    public static void main() {
        JFrame frame = new SportFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200, 250);
        frame.setTitle("Sportweek");
        frame.setVisible(true);
    }
    
    public SportFrame() {
        setContentPane(new SportPanel());
    }
    
}