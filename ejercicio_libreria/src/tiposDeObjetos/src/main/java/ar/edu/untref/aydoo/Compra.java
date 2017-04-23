
/* Tipo de Objeto: Value Object */
public class Compra {
	
	private Cliente miCliente;
	private Producto unProducto;
	private int cantidad;
	private String mes;
	
	public Compra(Cliente unCliente, Producto producto,int cantidad, String mes){
		
		this.setCantidad(cantidad);
		this.setNuevoProducto(producto);
		this.setMiCliente(unCliente);
		this.setMes(mes);
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public void setNuevoProducto(Producto nuevoProducto) {
		this.unProducto = nuevoProducto;
	}
	
	public String getMes() {
		return mes;
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public int getCantidad() {
		return cantidad;
	}
	
	public Producto getNuevoProducto() {
		return unProducto;
	}
	
	public void setMiCliente(Cliente miCliente) {
		this.miCliente = miCliente;
	}
	
	public Cliente getMiCliente() {
		return miCliente;
	}
	
}
