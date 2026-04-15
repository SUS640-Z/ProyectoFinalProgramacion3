package exceptions;

public class InvalidPasswordException extends Exception {
	
	public InvalidPasswordException() {
		super("El correo es invaido");
	}
	public InvalidPasswordException(String mensaje) {
		super(mensaje);
	}

}