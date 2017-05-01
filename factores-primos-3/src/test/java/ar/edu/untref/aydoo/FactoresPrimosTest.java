import java.util.LinkedList;

import org.junit.Assert;
import org.junit.Test;


public class FactoresPrimosTest {

	@Test
	public void testFactoresPrimos90ConFormaDeOrdenAscendente(){
		int numero = 90;
		LinkedList<Integer> factoreo90 = new LinkedList<Integer>();
		factoreo90.add(2);
		factoreo90.add(3);
		factoreo90.add(3);
		factoreo90.add(5);

		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularFactor(numero);
    	
    	LinkedList<Integer> resultado = factoresPrimos.getFormaDeOrden("asc");
    	Assert.assertEquals(factoreo90,resultado);
		
	}
}	
