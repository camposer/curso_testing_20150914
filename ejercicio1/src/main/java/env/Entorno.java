package env;

public class Entorno {
	private static Tipo tipo = Tipo.PROD;
	
	public static enum Tipo {
		PROD, TEST;
	}
	
	public static Tipo getTipoActivo() {
		return tipo;
	}
	
	public static void setTipoActivo(Tipo tipo) {
		Entorno.tipo = tipo;
	}
}
