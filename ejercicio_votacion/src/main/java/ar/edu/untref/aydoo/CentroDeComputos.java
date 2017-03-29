
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CentroDeComputos {

	private Set<Provincia> provincias;
	
	public  CentroDeComputos(){

		this.provincias = new HashSet<Provincia>();
		
	}

	public void agregarProvincia(Provincia unaProvincia) {
		provincias.add(unaProvincia);

	}
	public void emitirVoto(Voto unVoto) {

		for (Provincia provinciaActual : provincias) {
			if (unVoto.getProvincia().equals(provinciaActual)) {
				provinciaActual.agregarVoto(unVoto);
			}
		}

	}
	
	public Candidato obtenerCandidatoConMasVotosObtenidosANivelNacional(){
		
		HashMap<Candidato, Integer> resultadoParcial = new HashMap<Candidato, Integer>();
		Candidato candidato = null;
		Candidato candidatoGanador = null;
		int cantidadDeVotos = 0;

		for (Provincia provinciaActual : provincias) {

			resultadoParcial = provinciaActual.candidatosYSusVotos();

			for (Entry<Candidato, Integer> votacion : resultadoParcial.entrySet()) {
				candidato = votacion.getKey();
				
				if (candidato.cantidadDeVotosObtenidos() > cantidadDeVotos) {
					candidatoGanador = candidato;
				}
				cantidadDeVotos = candidatoGanador.cantidadDeVotosObtenidos();
			}
		}
		return candidatoGanador;
	
	}
	
	public Partido obtenerPartidoConMasVotosEnProvincia(Provincia provincia){
		Comparator<Partido> comparador = new Partido(null);
		SortedSet<Partido> partidos = new TreeSet<Partido>(comparador);

		for(int i= 0; i <this.provincias.size(); i++ ){
			if(this.provincias.equals(i) == this.provincias.equals(provincia)){
				partidos.addAll(provincia.getPartidos());
			}
		}
	
		return partidos.first();
	}

}
