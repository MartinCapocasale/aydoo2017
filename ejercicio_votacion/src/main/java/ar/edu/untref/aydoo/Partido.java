import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


public class Partido implements Comparator<Partido> {
	
	private String nombrePartido;
	private Set<Candidato> candidatos;
	
	public Partido(String nombre){
		this.setNombrePartido(nombre);
		this.candidatos = new HashSet<Candidato>();
	}
	
	public void setNombrePartido(String nombre){
		this.nombrePartido = nombre;
	}
	
	public String getNombrePartido(){
		return this.nombrePartido;
	}
	
	public void agregarCandidatoAPartido(Candidato candidato){
		this.candidatos.add(candidato);
	}
	
	public Set<Candidato> getCandidatos(){
		return this.candidatos;
	}
	
	public int cantidadDeVotosPorCandidato(Candidato unCandidato) {
		int cantidadDeVotos = 0;
		
		for(int i=0; i < this.candidatos.size();i++){
			
			if(this.candidatos.equals(i) == this.candidatos.equals(unCandidato)){
				cantidadDeVotos = unCandidato.cantidadDeVotosObtenidos();
			}
		}
		return cantidadDeVotos;
	}

	public int cantidadTotalDeVotos() {
		int cantidadTotalDeVotos = 0;
			
		for (Candidato candidatoActual : candidatos) {
			cantidadTotalDeVotos = cantidadTotalDeVotos + candidatoActual.cantidadDeVotosObtenidos();
		}
		return cantidadTotalDeVotos;
	}

	public void agregarVoto(Voto unVoto) {
		
		for(Candidato candidatoActual : candidatos){
			
			if(candidatoActual.equals(unVoto.candidatoVotado())){
				candidatoActual.agregarVoto(unVoto);
			}
		}
		
	}
	public int compareTo(Partido partido1, Partido partido2) {

		int resultado;

		if (partido1.cantidadTotalDeVotos() == partido2.cantidadTotalDeVotos()) {

			resultado = partido1.getNombrePartido().compareTo(partido2.getNombrePartido());

		} 
		else if (partido1.cantidadTotalDeVotos() > partido2.cantidadTotalDeVotos()) {

			resultado = -1;

		} 
		else {

			resultado = 1;
		}

		return resultado;
	}
	
	public int compare(Partido partido1, Partido partido2) {
		return 0;
	}

}
