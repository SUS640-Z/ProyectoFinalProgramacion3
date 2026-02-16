package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPasswordField;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class LoginView extends JPanel{
	public LoginView(){
		setLayout(null);
		setBackground(new Color(15, 19, 9));
		
		JButton btnConfimar = new JButton("Ingresar");
		btnConfimar.setFont(new Font("Times New Roman", Font.PLAIN, 23));
		btnConfimar.setBackground(new Color(48, 60, 26));
		btnConfimar.setForeground(Color.WHITE);
		btnConfimar.setBounds(143,317, 316, 40);
		btnConfimar.setBorder(new LineBorder(Color.GRAY, 3, true));				
		add(btnConfimar);
				
		//USUARIO
		JLabel labelUsuario = new JLabel("USUARIO");
		labelUsuario.setBounds(133, 131, 120, 25);
		labelUsuario.setForeground(Color.WHITE);
		labelUsuario.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(labelUsuario);
		
		JTextField txtUsuario = new JTextField();
		txtUsuario.setBounds(143, 155, 316, 25);
		add(txtUsuario);

		// CONTRASENA
		JLabel labelContrasena = new JLabel("CONTRASENA");
		labelContrasena.setBounds(133, 220, 140, 25);
		labelContrasena.setForeground(Color.WHITE);
		labelContrasena.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		add(labelContrasena);

		JPasswordField txtContrasena = new JPasswordField();
		txtContrasena.setBounds(143, 246, 316, 25);
		add(txtContrasena);
		
		//Titulo de inicio de sesion
		JLabel lblIniciarSesion = new JLabel("Iniciar Sesion");
		lblIniciarSesion.setFont(new Font("Times New Roman", Font.PLAIN, 40));
		lblIniciarSesion.setForeground(new Color(255, 255, 255));
		lblIniciarSesion.setBounds(169, 41, 254, 62);
		lblIniciarSesion.setForeground(Color.WHITE);
		lblIniciarSesion.setHorizontalAlignment(SwingConstants.CENTER);
		add(lblIniciarSesion);
		
		JLabel lblErrorIngresarDatos = new JLabel("Usuario y/o Contraseña son incorrectos");
		lblErrorIngresarDatos.setHorizontalAlignment(SwingConstants.CENTER);
		lblErrorIngresarDatos.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblErrorIngresarDatos.setBackground(new Color(128, 255, 255));
		lblErrorIngresarDatos.setBounds(143, 357, 316, 57);
		lblErrorIngresarDatos.setForeground(new Color(195, 136, 93));
		add(lblErrorIngresarDatos);
		
		JLabel lblContraseaRequerida = new JLabel("Contraseña Requerida");
		lblContraseaRequerida.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblContraseaRequerida.setBackground(new Color(128, 255, 255));
		lblContraseaRequerida.setBounds(357, 253, 140, 57);
		lblContraseaRequerida.setForeground(new Color(195, 136, 93));
		add(lblContraseaRequerida);
		
		JLabel lblUsuarioRequerido = new JLabel("Usuario Requerido");
		lblUsuarioRequerido.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblUsuarioRequerido.setBackground(new Color(128, 255, 255));
		lblUsuarioRequerido.setBounds(357, 166, 140, 57);
		lblUsuarioRequerido.setForeground(new Color(195, 136, 93));
		add(lblUsuarioRequerido);
		
		
		JLabel lblCafeImg = new JLabel("");
		lblCafeImg.setBounds(125, 320, 350, 350);
		lblCafeImg.setIcon(cargarIcono("../img/cafe.png", 350, 350));
		add(lblCafeImg);
		
		
	}
	
	private ImageIcon cargarIcono(String ruta, int ancho, int largo) {

		try {
			Image icono = ImageIO.read(getClass().getResource(ruta));
			icono = icono.getScaledInstance(ancho, largo, Image.SCALE_SMOOTH);
			return new ImageIcon(icono);
		}catch(Exception ex) {
			System.out.println("No está la imagen del ícono");
		}
		
		return null;
	}
	
	
}
