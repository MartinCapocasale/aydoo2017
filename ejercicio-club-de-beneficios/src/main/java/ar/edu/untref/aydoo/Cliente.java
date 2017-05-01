import java.util.LinkedList;
import java.util.List;

public class Cliente {

	public String nombreCliente;
	public String emailCliente;
	public Tarjeta tipoDeTarjeta;
	private List<Operacion> operaciones = new LinkedList<Operacion>();
	
	public Cliente(String nombre, String email,Tarjeta tarjeta) {
		this.setNombre(nombre);
		this.setEmail(email);
		this.tipoDeTarjeta = tarjeta;
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

	public Tarjeta getTarjeta(){
		return tipoDeTarjeta;
	}
	
	public List<Operacion> getOperaciones() {
        return this.operaciones;
    }

    public double calcularAhorro(Mes mesACalcular) {

        double ahorro = 0;
        
        for(Operacion operacion : operaciones){
        	if(operacion.getMes().equals(mesACalcular)){
        		ahorro = ahorro + operacion.getImporte();
        
        	}
        }
        return ahorro;
    }
    
    public void registrarOperacion(Operacion operacion) {
        this.operaciones.add(operacion);
        
    }
    
    public double calculoDineroPagado(){
    	
    	double importe = 0;
    	
    	for(Operacion operacion : operaciones){
    		importe = importe + operacion.getImporte();
    	}
    	return importe;
    }
	
}
