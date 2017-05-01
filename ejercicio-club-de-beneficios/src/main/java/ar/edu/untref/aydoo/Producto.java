
public class Producto {
	
	private String nombreProducto;
	private double importe;
	private double importeConBeneficio;
	
	
	public Producto(String nombre, double unImporte){
		this.setNombreProducto(nombre);
		this.setImporte(unImporte);
	}
	
	public void setNombreProducto(String unNombre){
		this.nombreProducto = unNombre;
	}
	
	public String getNombre(){
		return this.nombreProducto;
	}
	
	public void setImporte(double unImporte){
		this.importe = unImporte;
	}
	
	public double getImporte(){
		return importe;
	}
	
	public void setBeneficio(double unImporte){
		this.importeConBeneficio = unImporte;
		
	}
	
	public double getImporteConBeneficio(){
		return importeConBeneficio;
	}
	
	

	
}
