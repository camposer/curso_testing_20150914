package exception;

import exception.CalculadoraException;

public class SustraendoInvalidoException extends CalculadoraException {
	private static final long serialVersionUID = -8902347136796144094L;

	private int sustraendoInvalido;
	
	public SustraendoInvalidoException(int sustraendoInvalido) {
		this.sustraendoInvalido = sustraendoInvalido;
	}

	public int getSustraendoInvalido() {
		return sustraendoInvalido;
	}

	public void setSustraendoInvalido(int sustraendoInvalido) {
		this.sustraendoInvalido = sustraendoInvalido;
	}
}
