package exception;

public class EnteroInvalidoException 
		extends CalculadoraException {
	
	private static final long serialVersionUID = -5762866301046841965L;

	private int enteroInvalido;
	
	public EnteroInvalidoException(int enteroInvalido) {
		this.enteroInvalido = enteroInvalido;
	}

	public int getEnteroInvalido() {
		return enteroInvalido;
	}

	public void setEnteroInvalido(int enteroInvalido) {
		this.enteroInvalido = enteroInvalido;
	}
}
