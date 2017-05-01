

public class Operacion {

    private double importe;
    private Beneficio beneficio;
    
    public Operacion(Beneficio beneficio, int importeOriginal) {
        this.beneficio = beneficio;
    }
    
    public double getImporte(){
        return this.importe;
    }
    
    public Beneficio getBeneficio(){
    	return this.beneficio;
    	
    }
    
}