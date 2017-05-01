
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

    public int getValorBeneficio() {
        return this.valor;
    }
    public void aplicarBeneficio(){
    	
    }
	
}
