
public class Voto {
	
	
	private Candidato candidatoVotado;
	private Provincia provincia;

	
	public Voto(Candidato candidato, Provincia provincia){
		this.emisionDeVoto(candidato, provincia);
	}
	
	public void emisionDeVoto(Candidato candidato, Provincia provincia){
		this.candidatoVotado = candidato;
		this.provincia = provincia;
	}

	public Candidato candidatoVotado(){
		return this.candidatoVotado;
	}
	
	public Provincia getProvincia(){
		return this.provincia;
	}

}
