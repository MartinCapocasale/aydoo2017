
public class Suscripcion {
	
	private Cliente Cliente;
	private Producto unProducto;
	private String periodicidad; 
	private String mes;
	private String tiempoDeSuscripcion;
	
	public Suscripcion(Cliente nuevoCliente, Producto nuevoProducto, String mes, String tiempoDeSuscripcion){
		
		this.setMiCliente(nuevoCliente);
		this.setNuevoProducto(nuevoProducto);
		this.setPeriodicidad(nuevoProducto.getPeriodicidad());
		this.setMes(mes);
		this.setTiempoDeSuscripcion(tiempoDeSuscripcion);
	}
	
	public void setMiCliente(Cliente miCliente){
		this.Cliente = miCliente;
	}
	
	public Cliente getMiCliente(){
		return Cliente;
	}
	
	public Producto getNuevoProducto(){
		return unProducto;
	}
	
	public void setNuevoProducto(Producto nuevoProducto){
		this.unProducto = nuevoProducto;
	}
	
	public void setPeriodicidad(String periodicidad){
		this.periodicidad = periodicidad;
	}
	
	public void setMes(String mes) {
		this.mes = mes;
	}
	
	public String getMes() {
		return mes;
	}
	
	public int getCantidadDeEjemplares() {
		int cantidadDeEjemplares = 0;
		
		switch (this.periodicidad){
			case "diaria":
				cantidadDeEjemplares = 30;
				break;
			case "quincenal":
				cantidadDeEjemplares = 2;
				break;
			case "mensual":
				cantidadDeEjemplares = 1;
				break;
		}
		return cantidadDeEjemplares;
	}
	
	public void setTiempoDeSuscripcion(String tiempoDeSuscripcion) {
		this.tiempoDeSuscripcion = tiempoDeSuscripcion;
	}
	
	public String getTiempoDeSuscripcion() {
		return tiempoDeSuscripcion;
	}
	
}
