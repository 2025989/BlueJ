import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class SportPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SportPanel extends JPanel {
    
    private JLabel naamLabel, klasLabel, geslachtLabel, nummerLabel;
    private JTextField naamInput, klasInput, geslachtInput, nummerInput;
    private JButton add, print;
    private Team team;
    
    public SportPanel() {
        naamLabel = new JLabel("Naam:");
        add(naamLabel);
        naamInput = new JTextField(10);
        add(naamInput);
        klasLabel = new JLabel("Klas:");
        add(klasLabel);
        klasInput = new JTextField(10);
        add(klasInput);
        geslachtLabel = new JLabel("Geslacht:");
        add(geslachtLabel);
        geslachtInput = new JTextField(10);
        add(geslachtInput);
        nummerLabel = new JLabel("Nummer:");
        add(nummerLabel);
        nummerInput = new JTextField(10);
        add(nummerInput);
        
        add = new JButton("Voeg speler toe");
        add(add);
        add.addActionListener(new AddListener());
        
        print = new JButton("Print team");
        add(print);
        print.addActionListener(new PrintListener());
        
        team = new Team();
    }
    
    class AddListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            team.voegtoe(new Leerling(
                naamInput.getText(),
                klasInput.getText(),
                geslachtInput.getText(),
                Integer.parseInt(nummerInput.getText())
            ));
            naamInput.setText("");
            klasInput.setText("");
            geslachtInput.setText("");
            nummerInput.setText("");
            naamInput.requestFocus();
        }
    }
    
    class PrintListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            team.print();
        }
    }
    
}