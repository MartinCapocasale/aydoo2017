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
	
	@Test
	public void testFactoresPrimos360ConFormaDeOrdenAscendente(){
		int numero = 360;
		LinkedList<Integer> factoreo360 = new LinkedList<Integer>();
		factoreo360.add(2);
		factoreo360.add(2);
		factoreo360.add(2);
		factoreo360.add(3);
		factoreo360.add(3);
		factoreo360.add(5);

		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularFactor(numero);
 	
    	LinkedList<Integer> resultado = factoresPrimos.getFormaDeOrden("asc");
    	Assert.assertEquals(factoreo360,resultado);
		
	}
	
	@Test
	public void testFactoresPrimos12ConFormaDeOrdenDescendete(){
		int numero = 12;
		LinkedList<Integer> factoreo12 = new LinkedList<Integer>();
		factoreo12.add(3);
		factoreo12.add(2);
		factoreo12.add(2);


		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularFactor(numero);
 	
    	LinkedList<Integer> resultado = factoresPrimos.getFormaDeOrden("des");
    	Assert.assertEquals(factoreo12,resultado);
		
	}
	
	@Test
	public void testFactoresPrimos90ConFormaDeOrdenDescendete(){
		int numero = 90;
		LinkedList<Integer> factoreo90 = new LinkedList<Integer>();
		factoreo90.add(5);
		factoreo90.add(3);
		factoreo90.add(3);
		factoreo90.add(2);
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularFactor(numero);
    	
    	LinkedList<Integer> resultado = factoresPrimos.getFormaDeOrden("des");
    	Assert.assertEquals(factoreo90,resultado);
		
	}
}

	

