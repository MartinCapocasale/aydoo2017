
public class Cliente {

	public String nombreCliente;
	public String emailCliente;
	
	public Cliente(String nombre, String email) {
		this.setNombre(nombre);
		this.setEmail(email);
	}
	
	public void setNombre(String nombre){
		this.nombreCliente = nombre;
	}
	
	public void setEmail(String email){
		this.emailCliente = email;
	}
	
	public String getNombre(){
		return this.nombreCliente;
	}
	
	public String getEmail(){
		return this.emailCliente;
	}

}
