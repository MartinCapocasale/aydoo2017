import java.util.Comparator;


public class Comparador implements Comparator<Partido> {
	
	public int compare(Partido partido1, Partido partido2) {

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
}
