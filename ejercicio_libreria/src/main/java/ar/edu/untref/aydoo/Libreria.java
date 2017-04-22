import java.util.LinkedList;
import java.util.List;

public class Libreria {
	
	List<Compra> listaDeCompras = new LinkedList<Compra>();
	List<Cliente> listaDeClientes = new LinkedList<Cliente>();
	List<Suscripcion> listaDeSuscripciones = new LinkedList<Suscripcion>();
	
	public void nuevaCompra(Compra nuevaCompra) {
		listaDeCompras.add(nuevaCompra);
	}
	
	public void addCliente(Cliente nuevoCliente) {
		listaDeClientes.add(nuevoCliente);
	}
	
	public void nuevaSuscripcion(Suscripcion nuevaSuscripcion) {
		listaDeSuscripciones.add(nuevaSuscripcion);
	}
	
}