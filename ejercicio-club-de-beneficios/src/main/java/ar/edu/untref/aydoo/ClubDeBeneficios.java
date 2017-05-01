import java.util.LinkedList;
import java.util.List;

public class ClubDeBeneficios {
	
	List<Establecimiento> listaDeEstablecimientos = new LinkedList<Establecimiento>();
    
	public void agregarEstablecimiento(Establecimiento establecimiento) {
        this.listaDeEstablecimientos.add(establecimiento);
    }

    public Establecimiento obtenerEstablecimientoAFelicitar() {
    	return this.listaDeEstablecimientos.get(0);
    }

}
