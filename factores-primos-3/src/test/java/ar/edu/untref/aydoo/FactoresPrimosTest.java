import org.junit.Assert;
import org.junit.Test;


public class FactoresPrimosTest {

	@Test
	public void testFactoresPrimos90(){
		int numero = 90;
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	String resultado = factoresPrimos.calcularFactor(numero);
 	
    	Assert.assertEquals("2 3 3 5 ",resultado);
		
	}

	@Test
	public void testFactoresPrimos360(){
		int numero = 360;
	
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		String resultado = factoresPrimos.calcularFactor(numero);
 	
    	Assert.assertEquals("2 2 2 3 3 5 ",resultado);
		
	}
	
	@Test
	public void testFactoresPrimos12(){
		int numero = 12;

		FactoresPrimos factoresPrimos = new FactoresPrimos();
		String resultado = factoresPrimos.calcularFactor(numero);
 	
    	Assert.assertEquals("2 2 3 ",resultado);
		
	}
	
	@Test
	public void testFactoresPrimos2(){
		int numero = 2;
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		String resultado = factoresPrimos.calcularFactor(numero);
 	
    	Assert.assertEquals("2 ",resultado);
		
	}

}

	

