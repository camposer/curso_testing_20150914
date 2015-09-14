package exception;

import exception.CalculadoraException;

public class DivisorInvalidoException extends CalculadoraException {
	private static final long serialVersionUID = 6700461778579989119L;

	private int divisorInvalido;
	
	public DivisorInvalidoException(int divisorInvalido) {
		this.divisorInvalido = divisorInvalido;
	}

	public int getDivisorInvalido() {
		return divisorInvalido;
	}

	public void setDivisorInvalido(int divisorInvalido) {
		this.divisorInvalido = divisorInvalido;
	}
}
