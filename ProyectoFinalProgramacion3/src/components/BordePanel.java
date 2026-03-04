package components;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;


public class BordePanel extends JPanel {
	
	public BordePanel(String titulo,Color color){
		Border emptyBorder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        Border panelTitledBorder = BorderFactory.createTitledBorder(
                BorderFactory.createLineBorder(color, 2),
                titulo, 
                TitledBorder.CENTER,
                TitledBorder.TOP,
                new Font("Arial", Font.BOLD, 14),
                color);

        setBorder(BorderFactory.createCompoundBorder(emptyBorder, panelTitledBorder));
        setLayout(null);
        
	}
	
}
