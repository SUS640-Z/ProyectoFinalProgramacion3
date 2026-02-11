package views;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginView extends JPanel{
	public LoginView(){
		setLayout(null);
		setBackground(new Color(20, 20, 20));
		
		JButton btnConfimar = new JButton("Ingresar");
		btnConfimar.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnConfimar.setBackground(new Color(48, 60, 26));
		btnConfimar.setForeground(Color.WHITE);
		btnConfimar.setBounds(95, 281, 316, 40);
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
		lblIniciarSesion.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblIniciarSesion.setForeground(new Color(255, 255, 255));
		lblIniciarSesion.setBounds(117, 40, 254, 62);
		lblIniciarSesion.setForeground(Color.WHITE);
		lblIniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIniciarSesion);
	}
}
