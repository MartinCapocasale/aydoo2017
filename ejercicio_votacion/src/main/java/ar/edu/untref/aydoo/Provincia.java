import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


	public class Provincia {

		private String nombreProvincia;
		private Set<Partido> partidos;

		public Provincia(String nombre) {
			this.nombreProvincia = nombre;
			this.partidos = new HashSet<Partido>();
		}

		public String getNombreProvincia() {
			return this.nombreProvincia;
		}

		public void agregarPartido(Partido unPartido) {
			this.partidos.add(unPartido);
		}

		public Set<Partido> getPartidos() {
			return this.partidos;
		}

		public int cantidadDeVotosPorPartido(Partido unPartido) {
			int cantidadDeVotos = 0;
			
			for(int i= 0; i <this.partidos.size(); i++ ){
				
			      if(this.partidos.equals(i) == this.partidos.equals(unPartido)){
			    	  cantidadDeVotos = cantidadDeVotos + unPartido.cantidadTotalDeVotos();
			      }
			}			
			return cantidadDeVotos;
		}

		public int cantidadDeVotosPorCandidato(Candidato unCandidato) {
			int cantidadDeVotos = 0;

			for (Partido partidoActual : partidos) {
				
				if (partidoActual.getCandidatos().contains(unCandidato)) {
					cantidadDeVotos = cantidadDeVotos + partidoActual.cantidadDeVotosPorCandidato(unCandidato);
				}
			}			
			return cantidadDeVotos;
		}

		public void agregarVoto(Voto unVoto) {
			
			for (Partido partidoActual : partidos) {
				
				if (partidoActual.getCandidatos().contains(unVoto.candidatoVotado())) {
					partidoActual.agregarVoto(unVoto);
				}
			}

		}

		public HashMap<Candidato, Integer> candidatosYSusVotos() {
			HashMap<Candidato, Integer> resultadoProvincial = new HashMap<Candidato, Integer>();
			Set<Candidato> candidatos = new HashSet<Candidato>();
			
			for (Partido partidoActual : partidos) {
				candidatos = partidoActual.getCandidatos();
				
				for (Candidato candidatoActual : candidatos) {
					int cantidadDeVotos = candidatoActual.cantidadDeVotosObtenidos();
					resultadoProvincial.put(candidatoActual, cantidadDeVotos);
				}
			}
			return resultadoProvincial;
		}
		
}
