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
		
		public LinkedList imprimir(){
		
				return this.array;
		
		}
				
}

