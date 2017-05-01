import java.util.LinkedList;
import java.util.List;


public class Establecimiento {
	
	private String nombre;
	private List<Sucursal> listaDeSucursales = new LinkedList<Sucursal>();
	private List<Beneficio> beneficios = new LinkedList<Beneficio>();

	public Establecimiento(String nombre) {
        this.setNombreEstablecimiento(nombre);
	}
	
	public String getNombreEstablecimiento(){
		return this.nombre;
	}
	
	public void setNombreEstablecimiento(String unNombre){
		this.nombre = unNombre;
	}
	
	public List<Sucursal> getSucursales(){
		return this.listaDeSucursales;
	}
	
	public void agregarSucursal(Sucursal sucursal) {
	        this.listaDeSucursales.add(sucursal);
	        sucursal.setEstablecimiento(this);
	}
	
	public void agregarBeneficio(Beneficio beneficio) {
	       this.beneficios.add(beneficio);
	}
	
	public boolean tieneBeneficio(Tarjeta tarjeta) {
	        
	      boolean tiene = false;
	        
	        for(int i = 0 ; i < this.beneficios.size() && !tiene ; i++) {
	            
	            Beneficio beneficio = this.beneficios.get(i);
	            tiene = beneficio.getTarjeta().equals(tarjeta);
	        }
	        return tiene;
	}

}
