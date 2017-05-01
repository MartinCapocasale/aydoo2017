

public class Operacion {

    private double importe;
    private Beneficio beneficio;
    private Mes mes;
    
    public Operacion(Beneficio beneficio, int importeOriginal) {
        this.beneficio = beneficio;
    }
    
    public double getImporte(){
        return this.importe;
    }
    
    public Beneficio getBeneficio(){
    	return this.beneficio;
    	
    }
    public Mes getMes(){
    	return this.mes;
    }
    
}