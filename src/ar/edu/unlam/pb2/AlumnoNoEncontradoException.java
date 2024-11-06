package ar.edu.unlam.pb2;

public class AlumnoNoEncontradoException extends Exception{
	public static final long serialVersionUID = 10L;
	
    public AlumnoNoEncontradoException(String message) {
        super(message);
    }
}
