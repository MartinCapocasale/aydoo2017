import org.junit.Test;

public class ExcepcionDeValorIngresadoTest {
	
	@Test(expected = ExcepcionDeValorIngresado.class)
	public void intentoCalcularConUnValorInvalido(){
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		factoresPrimos.calcularFactor(-2);
	}
}
