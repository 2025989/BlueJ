import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class LampSwitchPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LampSwitchPanel extends JPanel implements ActionListener {
    
    private JButton lampButton1, lampButton2, lampButton3;
    private Lamp lamp1, lamp2, lamp3;
    
    public LampSwitchPanel() {
        lampButton1 = new JButton("aan");
        add(lampButton1);
        lampButton1.addActionListener(this);
        lamp1 = new Lamp(100);
        lamp1.maakZichtbaar();
        
        lampButton2 = new JButton("aan");
        add(lampButton2);
        lampButton2.addActionListener(this);
        lamp2 = new Lamp(200);
        lamp2.maakZichtbaar();
        
        lampButton3 = new JButton("aan");
        add(lampButton3);
        lampButton3.addActionListener(this);
        lamp3 = new Lamp(300);
        lamp3.maakZichtbaar();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == lampButton1) {
            if (lampButton1.getText().equals("aan")) {
                lamp1.aan();
                lampButton1.setText("uit");
            }
            else {
                lamp1.uit();
                lampButton1.setText("aan");
            }
        }
        if (e.getSource() == lampButton2) {
            if (lampButton2.getText().equals("aan")) {
                lamp2.aan();
                lampButton2.setText("uit");
            }
            else {
                lamp2.uit();
                lampButton2.setText("aan");
            }
        }
        if (e.getSource() == lampButton3) {
            if (lampButton3.getText().equals("aan")) {
                lamp3.aan();
                lampButton3.setText("uit");
            }
            else {
                lamp3.uit();
                lampButton3.setText("aan");
            }
        }
    }
    
}