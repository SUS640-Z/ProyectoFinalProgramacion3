package components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class LblAlertForm extends JLabel{
	public LblAlertForm(String mensaje){
		super(mensaje);
		this.setFont(new Font("Arial", Font.BOLD, 10));
        this.setForeground(Color.RED);
	}

}
