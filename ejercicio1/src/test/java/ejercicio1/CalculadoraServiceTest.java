package ejercicio1;

import org.junit.Assert;
import org.junit.Test;

import exception.DivisorInvalidoException;
import exception.EnteroInvalidoException;
import exception.ResultadoInvalidoException;
import exception.SustraendoInvalidoException;
import service.CalculadoraService;
import service.CalculadoraServiceFactory;

public class CalculadoraServiceTest {
	private CalculadoraService calculadoraService;
	
	public CalculadoraServiceTest() {
		this.calculadoraService = 
				CalculadoraServiceFactory.createCalculadoraService();
	}
	
	@Test
	public void sumar() {
		int c = calculadoraService.sumar(2, 2);
		Assert.assertEquals(4, c);
	}

	@Test(expected = EnteroInvalidoException.class)
	public void enteroInvalido() {
		calculadoraService.sumar(-1, 2);
		calculadoraService.sumar(0, -2);
	}

	@Test(expected = ResultadoInvalidoException.class)
	public void resultadoInvalido() {
		calculadoraService.sumar(Integer.MAX_VALUE, 1);
	}

	@Test
	public void restar() {
		int c = calculadoraService.restar(4, 2);
		Assert.assertEquals(2, c);
	}
	
	@Test(expected = SustraendoInvalidoException.class)
	public void restaConResultadoInvalido() {
		calculadoraService.restar(2, 3);
	}

	@Test
	public void multiplicar() {
		int c = calculadoraService.multiplicar(2, 3);
		Assert.assertEquals(6, c);
	}
	
	@Test(expected = ResultadoInvalidoException.class)
	public void multiplicarConResultadoInvalido() {
		calculadoraService.multiplicar(Integer.MAX_VALUE, 2);
	}

	@Test
	public void dividir() {
		int c = calculadoraService.dividir(4, 2);
		Assert.assertEquals(2, c);
	}

	@Test(expected = DivisorInvalidoException.class)
	public void divisorInvalido() {
		calculadoraService.dividir(4, 0);
	}

	@Test(expected = ResultadoInvalidoException.class)
	public void dividirResultadoNoEntero() {
		calculadoraService.dividir(5, 2);
	}
}
