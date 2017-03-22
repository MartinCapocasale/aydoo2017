package ar.edu.untref.aydoo;
import java.util.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class FactoresPrimosTest {

	
	
	@Test
	public void testFactoresPrimos90(){
		int numero = 90;
		LinkedList<Integer> factoreo90 = new LinkedList<Integer>();
		factoreo90.add(2);
		factoreo90.add(3);
		factoreo90.add(3);
		factoreo90.add(5);

		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularFactor(numero);
 	
    	Assert.assertEquals(factoreo90,factoresPrimos.imprimir());
		
	}
	@Test
	public void testFactoresPrimos360(){
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
 	
    	Assert.assertEquals(factoreo360,factoresPrimos.imprimir());
		
	}
	@Test
	public void testFactoresPrimos12(){
		int numero = 12;
		LinkedList<Integer> factoreo12 = new LinkedList<Integer>();
		factoreo12.add(2);
		factoreo12.add(2);
		factoreo12.add(3);


		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularFactor(numero);
 	
    	Assert.assertEquals(factoreo12,factoresPrimos.imprimir());
		
	}
	@Test
	public void testFactoresPrimos2(){
		int numero = 2;
		LinkedList<Integer> factoreo2 = new LinkedList<Integer>();
		factoreo2.add(2);
		
		FactoresPrimos factoresPrimos = new FactoresPrimos();
    	factoresPrimos.calcularFactor(numero);
 	
    	Assert.assertEquals(factoreo2,factoresPrimos.imprimir());
		
	}
}
