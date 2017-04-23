/* Tipo de Objeto: Value Object */
public class Producto {
	
	private String periodicidad;
	private double precioDeVenta;

	public Producto(double precio, String nuevaPeriodicidad){
		this.periodicidad = nuevaPeriodicidad;
		this.setPrecio(precio);
		
	}
	
	public String getPeriodicidad(){
		return this.periodicidad;
	}
	
	public void setPrecio(double precio) {
		this.precioDeVenta = precio;
	}
	
	public double getPrecio() {
		return precioDeVenta;
	}

}
