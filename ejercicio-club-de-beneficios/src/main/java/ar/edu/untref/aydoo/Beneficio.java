import java.util.LinkedList;
import java.util.List;


public class Beneficio {

    private Tarjeta tarjeta;
    private int valor;

    public Beneficio(Tarjeta tarjeta, int valor)throws ExcepcionBeneficio {
        this.tarjeta = tarjeta;
        int descuentoMinimo = 5;
        
        if(this.valor > descuentoMinimo){
        	this.valor = valor;
        }
        else{
        	throw new ExcepcionBeneficio();
        }
    }
    
    public Tarjeta getTarjeta(){
        return this.tarjeta;
    }

    public List<Producto> getValorBeneficio(List<Producto> productos) throws ExcepcionBeneficio {
    	List<Producto> unProducto = new  LinkedList<Producto>();
    	
    	for(Producto producto : productos){
    		double importe=0;
    		
    		importe = importe + producto.getImporte();
    		producto.setBeneficio(importe - (((100- this.valor)* importe) / 100.0));
    		unProducto.add(producto);
    			
    	}
    	return unProducto;   	
    }
	
}
