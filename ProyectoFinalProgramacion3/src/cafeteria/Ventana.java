package cafeteria;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

import views.LoginView;

public class Ventana extends JFrame{
	public Ventana() {
		//setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Pagina Web de Novato Sensacion");
		//setLocation(100,100);
		setBounds(200,100,1200,600); // cordenadas y tamaño
		setResizable(false);
		setLocationRelativeTo(null);// Colocar la ventana el centro
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image icono = tk.getImage("src/img/coffe.png");
		setIconImage(icono);
		//Panel panelito = new Panel();
		//add(panelito);
		LoginView login = new LoginView();
		add(login);
		setVisible(true);
	}

	
}