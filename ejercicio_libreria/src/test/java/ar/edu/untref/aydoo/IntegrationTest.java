import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class IntegrationTest {

	private Libreria miLibreria;
	private Revista Barcelona;
	private Revista ElGrafico;
	private Libro elHobbit;
	private ArticuloDeLibreria Lapicera;
	private Periodico Pagina12;
	private Periodico Clarin;
	private Cliente Juan;
	private Cliente Maria;
		
	@Before
	public void setup(){
		Barcelona = new Revista(20,"quincenal");
		ElGrafico = new Revista(30, "mensual");
		elHobbit = new Libro(50,"unica");
		Lapicera = new ArticuloDeLibreria(5,"unica");
		Pagina12 = new Periodico(12,"diaria");
		Clarin = new Periodico(13,"diaria");
		Juan = new Cliente("Juan");
		Maria = new Cliente("Maria");
		miLibreria = new Libreria();
		miLibreria.addCliente(Juan);
		miLibreria.addCliente(Maria);
	}
	@Test
	public void sePruebaCalcularMontoACobrarDeJuanCaso1(){
		miLibreria.nuevaCompra(new Compra(Juan, elHobbit, 1, "agosto"));
		miLibreria.nuevaCompra(new Compra(Juan, Lapicera, 2, "agosto"));
		miLibreria.nuevaCompra(new Compra(Juan, ElGrafico, 1, "agosto"));
		
		double montoACobrarEnAgosto = miLibreria.CalcularMontoACobrar("agosto", Juan);
		
		Assert.assertEquals(92.1, montoACobrarEnAgosto,0.01);
	}
	
	@Test
	public void sePruebaCalcularMontoACobrarDeMariaCaso2(){
		miLibreria.nuevaSuscripcion(new Suscripcion(Maria, Barcelona,"enero", "anual"));
		miLibreria.nuevaCompra(new Compra(Maria, Pagina12, 1, "enero"));
		
		double montoACobrar = miLibreria.CalcularMontoACobrar("enero", Maria);
		
		Assert.assertEquals(44, montoACobrar,0.01);
	}
	
	@Test 
    public void sePruebaElIvaEnArticuloDeLibreria() {
		Producto lapicera = new ArticuloDeLibreria(5,"PorUnicaVez");
		Assert.assertEquals(6.05, lapicera.getPrecio(),0.01);
	}
	
}
