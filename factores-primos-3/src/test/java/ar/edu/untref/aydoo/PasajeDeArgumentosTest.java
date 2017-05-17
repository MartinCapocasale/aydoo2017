import org.junit.Assert;
import org.junit.Test;

public class PasajeDeArgumentosTest {
	
	@Test
	public void testDeOrdenDescendente() {
		String args[] = { "90", "--format=pretty", "--sort=desc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		Assert.assertEquals("desc", nuevaEntrada.getOrden());
	}
	
	@Test
	public void testDeOrdenAscendente() {
		String args[] = { "90", "--format=pretty", "--sort=asc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		Assert.assertEquals("asc", nuevaEntrada.getOrden());
	}
	
	@Test
	public void TestDeOrdenAscendenteYgetFormatoPretty() {
		String args[] = { "90", "--format=pretty", "--sort=asc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		Assert.assertEquals("pretty", nuevaEntrada.getFormato());
	}
	
	@Test
	public void testGetNombreDeArchivo() {
		String args[] = { "90", "--output-file=salida.txt", "--format=quiet"};
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		Assert.assertEquals("salida.txt", nuevaEntrada.getNombreDeArchivo());
	}

}
