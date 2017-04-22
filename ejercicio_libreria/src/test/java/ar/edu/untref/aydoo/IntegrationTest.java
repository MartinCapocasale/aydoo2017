import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {

	@Test 
    public void sePruebaElIvaEnArticuloDeLibreria() {
		Producto lapiz = new ArticuloDeLibreria(5,"PorUnicaVez");
		Assert.assertEquals(6.05, lapiz.getPrecio(),0.1);
	}
		
}
