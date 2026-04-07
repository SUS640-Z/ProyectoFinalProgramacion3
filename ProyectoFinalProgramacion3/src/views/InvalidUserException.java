package views;

public class InvalidUserException extends Exception {
	public InvalidUserException() {
		super("El correo es invaido");
	}
	public InvalidUserException(String mensaje) {
		super(mensaje);
	}

}
