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
	private Suscripcion unaSuscripcion;
		
	@Before
	public void setup(){
		Barcelona = new Revista(20,"quincenal");
		ElGrafico = new Revista(30, "mensual");
		elHobbit = new Libro(50,"unico");
		Lapicera = new ArticuloDeLibreria(5,"unico");
		Pagina12 = new Periodico(12,"diaria");
		Clarin = new Periodico(13,"diaria");
		Juan = new Cliente("Juan");
		Maria = new Cliente("Maria");
		miLibreria = new Libreria();
		miLibreria.agregarCliente(Juan);
		miLibreria.agregarCliente(Maria);
	}
	@Test
	public void sePruebaCalcularMontoACobrarDeJuanCaso1(){
		miLibreria.nuevaCompra(new Compra(Juan, elHobbit, 1, "agosto"));
		miLibreria.nuevaCompra(new Compra(Juan, Lapicera, 2, "agosto"));
		miLibreria.nuevaCompra(new Compra(Juan, ElGrafico, 1, "agosto"));
		
		double montoACobrarEnAgosto = miLibreria.calcularMontoACobrar("agosto", Juan);
		
		Assert.assertEquals(92.1, montoACobrarEnAgosto,0.01);
	}
	
	@Test
	public void sePruebaCalcularMontoACobrarDeMariaCaso2(){
		miLibreria.nuevaSuscripcion(new Suscripcion(Maria, Barcelona,"enero", "anual"));
		miLibreria.nuevaCompra(new Compra(Maria, Pagina12, 1, "enero"));
		
		double montoACobrar = miLibreria.calcularMontoACobrar("enero", Maria);
		
		Assert.assertEquals(44, montoACobrar,0.01);
	}
	
	@Test 
    public void sePruebaElIvaEnArticuloDeLibreria() {
		Producto lapicera = new ArticuloDeLibreria(5,"unico");
		Assert.assertEquals(6.05, lapicera.getPrecio(),0.01);
	}
	
	@Test
	public void sePruebaCalcularMontoDeJuanComprandoUnPeriodico(){
		miLibreria.nuevaCompra(new Compra(Juan, Clarin, 1, "enero"));
		
		double montoACobrar =  miLibreria.calcularMontoACobrar("enero", Juan);
		
		Assert.assertEquals(13, montoACobrar,0.01);
	}
	
	@Test
	public void sePruebaCantidadDeVecesEnPeriodicidadEsDiaria(){
		unaSuscripcion = new Suscripcion(Juan, Pagina12, "agosto","diaria");
		
		int cantidad = unaSuscripcion.getCantidadDeEjemplares();
		
		Assert.assertEquals(30, cantidad);
	}
	
	@Test
	public void sePruebaCantidadDeVecesEnPeriodicidadEsQuincenal(){
		unaSuscripcion = new Suscripcion(Juan, Barcelona, "agosto", "quincenal");
		
		int cantidad = unaSuscripcion.getCantidadDeEjemplares();
		
		Assert.assertEquals(2, cantidad);
	}
	
	@Test
	public void sePruebaCantidadDeVecesEnPeriodicidadEsMensual(){

		unaSuscripcion = new Suscripcion(Juan, ElGrafico, "agosto","mensual");
		
		int cantidad = unaSuscripcion.getCantidadDeEjemplares();
		
		Assert.assertEquals(1, cantidad);
	}
	
}
