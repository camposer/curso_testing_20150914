package exception;

@SuppressWarnings("serial")
public abstract class CalculadoraException extends RuntimeException {
	
	public CalculadoraException() {
		
	}

	public CalculadoraException(String message) {
		super(message);
	}
	
	public CalculadoraException(Throwable tw) {
		super(tw);
	}
}
