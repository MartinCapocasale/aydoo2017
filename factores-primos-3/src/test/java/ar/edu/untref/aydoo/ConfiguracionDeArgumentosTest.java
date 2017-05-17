import org.junit.Assert;
import org.junit.Test;


public class ConfiguracionDeArgumentosTest {
	
	@Test
	public void testFactoresPrimos90PrettyAscendente() {
		String args[] = { "90", "--format=pretty", "--sort=asc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		
		ConfiguracionDeArgumentos configuracion = new ConfiguracionDeArgumentos();
		String resultado = configuracion.setArgumentos(90, "pretty", "2 3 3 5", nuevaEntrada.getOrden());
		
		Assert.assertEquals("asc", nuevaEntrada.getOrden());
		Assert.assertEquals("Factores primos 90: 2 3 3 5",resultado);
	}
	
	@Test
	public void testFactoresPrimos90PrettyDescendente() {
		String args[] = { "90", "--format=pretty", "--sort=desc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		
		ConfiguracionDeArgumentos controlador = new ConfiguracionDeArgumentos();
		String resultado = controlador.setArgumentos(90, "pretty", "2 3 3 5 ", nuevaEntrada.getOrden());
		
		Assert.assertEquals("desc", nuevaEntrada.getOrden());
		Assert.assertEquals("Factores primos 90: 5 3 3 2",resultado);
	}
	
	@Test
	public void testFactoresPrimos90QuietDescendente() {
		String args[] = { "90", "--format=quiet", "--sort=desc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		
		ConfiguracionDeArgumentos controlador = new ConfiguracionDeArgumentos();
		String resultado = controlador.setArgumentos(90, "quiet", "2 3 3 5 ", nuevaEntrada.getOrden());
		
		Assert.assertEquals("desc", nuevaEntrada.getOrden());
		Assert.assertEquals("5\n3\n3\n2",resultado);
	}
	
	@Test
	public void testFactoresPrimos90QuietAscendente() {
		String args[] = { "90", "--format=quiet", "--sort=asc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		
		ConfiguracionDeArgumentos controlador = new ConfiguracionDeArgumentos();
		System.out.println(nuevaEntrada.getOrden());
		String resultado = controlador.setArgumentos(90, "quiet", "2 3 3 5 ", nuevaEntrada.getOrden());
		
		Assert.assertEquals("asc", nuevaEntrada.getOrden());
		Assert.assertEquals("2\n3\n3\n5\n",resultado);
	}
	
	@Test
	public void testFactoresPrimos90FormatoNoAceptadoDescendente() {
		String args[] = { "90", "--format=hola", "--sort=desc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		
		ConfiguracionDeArgumentos controlador = new ConfiguracionDeArgumentos();
		String resultado = controlador.setArgumentos(90, "hola", "2 3 3 5 ", nuevaEntrada.getOrden());
		
		Assert.assertEquals("desc", nuevaEntrada.getOrden());
		Assert.assertEquals("Formato no aceptado. Las opciones posibles son: pretty o quiet.",resultado);
	}
	
	@Test
	public void testFactoresPrimos90FormatoNoAceptadoAscendente() {
		String args[] = { "90", "--format=chau", "--sort=asc" };
		PasajeDeArgumentos nuevaEntrada = new PasajeDeArgumentos(args);
		nuevaEntrada.analizarArgumentos();
		
		ConfiguracionDeArgumentos controlador = new ConfiguracionDeArgumentos();
		String resultado = controlador.setArgumentos(90, "chau", "2 3 3 5 ", nuevaEntrada.getOrden());
		
		Assert.assertEquals("asc", nuevaEntrada.getOrden());
		Assert.assertEquals("Formato no aceptado. Las opciones posibles son: pretty o quiet.",resultado);
	}

}