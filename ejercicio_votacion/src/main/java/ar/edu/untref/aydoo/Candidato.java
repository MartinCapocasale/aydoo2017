import java.util.List;
import java.util.LinkedList;

public class Candidato {
	
	private String nombre;
	private String apellido;
	private List<Voto> votos;
	
	public Candidato(String apellido,String nombre){
		this.nombre = nombre;
		this.apellido = apellido;
		this.votos = new LinkedList<Voto>();	
	}
	
	public void agregarVoto(Voto voto){
		this.votos.add(voto);
	}
	
	
	public String getNombre(){
		return this.nombre;
	}

	public String getApellido(){
		return this.apellido;
	}
	
	public int cantidadDeVotosObtenidos() {
		return votos.size();
	}
	
}
