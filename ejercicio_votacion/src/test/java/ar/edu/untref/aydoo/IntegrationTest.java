import org.junit.Assert;
import org.junit.Test;

public class IntegrationTest {
	
	@Test
	public void emitirVoto() {
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Provincia unaProvincia = new Provincia("Buenos Aires");	
		
		Partido unPartido = new Partido("FrenteA");
		Candidato unCandidato = new Candidato("Romero","Juan");
		Voto unVoto = new Voto(unCandidato, unaProvincia);
		
		unPartido.agregarCandidatoAPartido(unCandidato);
		unaProvincia.agregarPartido(unPartido);
		centroDeComputos.agregarProvincia(unaProvincia);
		centroDeComputos.emitirVoto(unVoto);
		centroDeComputos.emitirVoto(unVoto);
	
		Assert.assertEquals(2, unCandidato.cantidadDeVotosObtenidos());

	}
	@Test
	public void candidatoConMasVotosANivelNacional() {
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Provincia unaProvincia = new Provincia("Buenos Aires");
		
		Partido unPartido = new Partido("FrenteA");
		Partido otroPartido = new Partido("FrenteB");
		
		Candidato candidatoA = new Candidato("Romero","Juan");
		Candidato candidatoB = new Candidato("Smith","Pedro");
		Candidato candidatoC = new Candidato("Avila","Ricardo");
		
		Voto votoA = new Voto(candidatoA, unaProvincia);
		Voto votoB = new Voto(candidatoB, unaProvincia);
		Voto votoC = new Voto(candidatoC, unaProvincia);

		unPartido.agregarCandidatoAPartido(candidatoA);
		otroPartido.agregarCandidatoAPartido(candidatoC);
		otroPartido.agregarCandidatoAPartido(candidatoB);
		unaProvincia.agregarPartido(unPartido);
		unaProvincia.agregarPartido(otroPartido);
		centroDeComputos.agregarProvincia(unaProvincia);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoC);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoB);
		centroDeComputos.emitirVoto(votoB);

		Assert.assertEquals("Romero", centroDeComputos.obtenerCandidatoConMasVotosObtenidosANivelNacional().getApellido());
	}
	@Test
	public void partidoConMasVotosPorProvincia() {
		CentroDeComputos centroDeComputos = new CentroDeComputos();
		Provincia unaProvincia = new Provincia("Buenos Aires");
		
		Partido unPartido = new Partido("FrenteA");
		Partido otroPartido = new Partido("FrenteB");
		
		Candidato candidatoA = new Candidato("Romero","Juan");
		Candidato candidatoB = new Candidato("Smith","Pedro");
		Voto votoA = new Voto(candidatoA, unaProvincia);
		Voto votoB = new Voto(candidatoA, unaProvincia);
				

		unPartido.agregarCandidatoAPartido(candidatoA);
		otroPartido.agregarCandidatoAPartido(candidatoB);
		unaProvincia.agregarPartido(unPartido);
		unaProvincia.agregarPartido(otroPartido);
		centroDeComputos.agregarProvincia(unaProvincia);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoA);
		centroDeComputos.emitirVoto(votoB);
		centroDeComputos.emitirVoto(votoB);

		Assert.assertEquals(unPartido, centroDeComputos.obtenerPartidoConMasVotosEnProvincia(unaProvincia));
	}
	
	
}
	
