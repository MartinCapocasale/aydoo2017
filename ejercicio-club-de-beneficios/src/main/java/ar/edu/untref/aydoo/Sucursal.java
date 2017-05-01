import java.util.LinkedList;
import java.util.List;

public class Sucursal {

	private String nombreSucursal;	
    private List<Operacion> operaciones = new LinkedList<Operacion>();
    private Establecimiento establecimiento;

    public Sucursal(String nombre){
    	this.setNombre(nombre);
    }
    
    public void setNombre(String unNombre){
    	this.nombreSucursal = unNombre;
    }
    
    public String getNombreSucursal(){
    	return this.nombreSucursal;
    }
    
    public List<Operacion> getOperaciones() {
        return this.operaciones;
    }

    public void comprar(Cliente cliente, int importeOriginal) throws Exception {
 
        if (this.establecimiento.tieneBeneficio(cliente.getTarjeta())) {
        
            Operacion nuevaOperacion = new Operacion(null, importeOriginal);
            
            this.operaciones.add(nuevaOperacion);
            cliente.registrarOperacion(nuevaOperacion);
        
        }
        else{
            throw new Exception("No hay beneficio para esa tarjeta en este establecimiento");
        }
    }

    public void setEstablecimiento(Establecimiento establecimiento) {
        this.establecimiento = establecimiento;
    }
    
    public Establecimiento getEstablecimiento(){
    	return this.establecimiento;
    }
    
}
