
/* Tipo de Objeto: Value Object */
public class ArticuloDeLibreria extends Producto{
	
	public ArticuloDeLibreria(double precio, String periodicidad) {
		super(precio, periodicidad);
	}
	
	public double getPrecio(){
		return (super.getPrecio()*1.21);
	}
}