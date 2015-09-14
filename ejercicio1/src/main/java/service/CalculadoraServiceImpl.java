package service;

import exception.DivisorInvalidoException;
import exception.EnteroInvalidoException;
import exception.ResultadoInvalidoException;
import exception.SustraendoInvalidoException;

public class CalculadoraServiceImpl implements CalculadoraService {

	public int sumar(int a, int b) {
		validarOperando(a);
		validarOperando(b);
		
		long c = (long)a + b;
		
		if (c > Integer.MAX_VALUE)
			throw new ResultadoInvalidoException();
		
		return a + b;
	}

	private void validarOperando(int a) {
		if (a < 0)
			throw new EnteroInvalidoException(a);
	}

	public int restar(int a, int b) {
		validarOperando(a);
		validarOperando(b);

		if (b > a)
			throw new SustraendoInvalidoException(b);
		
		return a - b;
	}

	public int multiplicar(int a, int b) {
		validarOperando(a);
		validarOperando(b);

		long c = (long)a * b;
		
		if (c > Integer.MAX_VALUE)
			throw new ResultadoInvalidoException();

		return a * b;
	}

	public int dividir(int a, int b) {
		validarOperando(a);
		validarOperando(b);

		if (b == 0)
			throw new DivisorInvalidoException(b);
		if (a % b != 0)
			throw new ResultadoInvalidoException();
		
		return a / b;
	}

}
