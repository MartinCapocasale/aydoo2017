public class FactoresPrimos {

		private int factorPrimo;	
		/*
		 * pre: Se debe ingresar un numero.
		 * post: Retorna una variable de tipo String con los factores primos.
		 */
	
		public String calcularFactor(int numero) throws ExcepcionDeValorIngresado {
				
			String resultado = "";
			
			if (numero < 2) {
				throw new ExcepcionDeValorIngresado();
				
			}
			for(this.factorPrimo = 2; this.factorPrimo <= numero; this.factorPrimo++) {
				
					while(numero % this.factorPrimo == 0) {
						numero /= this.factorPrimo;
						resultado = resultado + Integer.toString(this.factorPrimo) + " ";
					}
		    }
			return resultado;
		}						
}