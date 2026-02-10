package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginView extends JPanel{
	public LoginView(){
		setLayout(null);
		JButton btnConfimar = new JButton("Ingresar");
		btnConfimar.setBounds(139, 193, 157, 38);
		add(btnConfimar);
		
		JTextField txtNombre = new JTextField();
		txtNombre.setBounds(172, 99, 96, 18);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setBounds(172, 146, 96, 18);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		lblIniciarSesion.setBounds(172, 39, 103, 38);
		add(lblIniciarSesion);
	}
}
