import org.junit.Test;
import org.junit.Assert;

public class ClienteTest {
	
	@Test
	public void seCreaClienteConNombreYMail(){
		
		String nombre = "Martin";
		String email = "martin@gmail.com";
		
		
		Cliente cliente = new Cliente(nombre,email);
		
		Assert.assertEquals(nombre, cliente.getNombre());
		Assert.assertEquals(email, cliente.getEmail());
		
	}
	
	
}
