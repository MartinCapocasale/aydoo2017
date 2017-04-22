import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;

public class Libreria {
	
	List<Compra> listaDeCompras = new LinkedList<Compra>();
	List<Cliente> listaDeClientes = new LinkedList<Cliente>();
	List<Suscripcion> listaDeSuscripciones = new LinkedList<Suscripcion>();
	
	
	public double CalcularMontoACobrar(String mes, Cliente unCliente) {
		double montoDescuento = 0;
		double montoACobrar = 0;
		Iterator<Compra> it = listaDeCompras.iterator();
		
		while(it.hasNext()){
			Compra compra = it.next();
			
			if (compra.getMes() == mes && compra.getMiCliente() == unCliente){
				montoACobrar += compra.getNuevoProducto().getPrecio() * compra.getCantidad();
			}
		}
		
		Iterator<Suscripcion> otroIt = listaDeSuscripciones.iterator();
		
		while(otroIt.hasNext()){
			Suscripcion suscripcion = otroIt.next();
		
			if (suscripcion.getMes() == mes && suscripcion.getMiCliente() == unCliente){
				if (suscripcion.getTiempoDeSuscripcion() == "anual"){
					montoDescuento = (suscripcion.getNuevoProducto().getPrecio() * suscripcion.getCantidadDeEjemplares())*0.2;
				}
				
				montoACobrar += suscripcion.getNuevoProducto().getPrecio() * suscripcion.getCantidadDeEjemplares();
			}
		}
		return montoACobrar - montoDescuento;
	}

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