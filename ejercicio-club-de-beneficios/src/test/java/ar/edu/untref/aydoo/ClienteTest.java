import org.junit.Test;
import org.junit.Assert;

public class ClienteTest {
	
	String nombre = "Martin";
	String email = "martin@gmail.com";
	
	@Test
	public void seCreaClienteConNombreYMail(){
		
		
		Cliente cliente = new Cliente(nombre,email,Tarjeta.CLASSIC);
		
		Assert.assertEquals(nombre, cliente.getNombre());
		Assert.assertEquals(email, cliente.getEmail());	
	}
	
	@Test
	public void elClienteTieneTarjetaClassic(){
		
		Cliente cliente = new Cliente(nombre, email,Tarjeta.CLASSIC);
		
		Assert.assertEquals(Tarjeta.CLASSIC, cliente.getTarjeta());	
	}
	
	@Test
	public void elClienteSeCreaConTarjetaClassicYSeObtieneTarjetaIncorrecta(){
		
		Cliente cliente = new Cliente(nombre, email,Tarjeta.CLASSIC);
		
		Assert.assertNotEquals(Tarjeta.PREMIUM, cliente.getTarjeta());
		
	}
		
}
