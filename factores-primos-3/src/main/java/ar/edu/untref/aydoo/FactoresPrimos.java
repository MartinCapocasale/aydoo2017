import java.util.ArrayList;
import java.util.LinkedList;

public class FactoresPrimos {

		private int factorPrimo;
		private LinkedList<Integer> array;

		public FactoresPrimos(){
			this.array = new LinkedList<Integer>();
		}	
		
		public void calcularFactor(int numero){

			    for(this.factorPrimo = 2; this.factorPrimo<=numero; this.factorPrimo++){
				
					while(numero % this.factorPrimo == 0){
					
						this.array.add((this.factorPrimo));
						numero /= this.factorPrimo;
					}
			    }	   			
		}	
		
		public LinkedList<Integer> imprimir(){
		
				return this.array;
		
		}

		public LinkedList<Integer> getFormaDeOrden(String formaIngresada) {
			LinkedList<Integer> resultado = new LinkedList<Integer>();
			
			if (formaIngresada.equals("des")) {
				resultado = this.getFormaDeOrdenFormaAscendente();
			}
			else if (formaIngresada.equals("asc")) {
				resultado = this.getFormaDeOrdenDescendente();
			}
			return resultado;
		}

		private LinkedList<Integer> getFormaDeOrdenFormaAscendente() {
			LinkedList<Integer> resultadoAscendente = new LinkedList<Integer>();
			
			for (int j = this.array.size() - 1; j >= 0; j--) {
				resultadoAscendente.add(this.array.get(j));
			}
			return resultadoAscendente;
		}

		private LinkedList<Integer> getFormaDeOrdenDescendente() {
			return this.array;
		}
				
}

