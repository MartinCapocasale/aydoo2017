
public class Cliente {

	private String nombreDelCliente;
	private String direccion;
	
	public Cliente(String nombre) {
		this.setNombreCliente(nombre);
	}
	
	public void setNombreCliente(String nombre){
		this.nombreDelCliente = nombre;
	}
	
	public String getNombreCliente(){
		return nombreDelCliente;
	}
	
	public void setDireccion(String direccion){
		this.direccion = direccion;
	}
	
	public String getDireccion(){
		return direccion;
	}
	
}
