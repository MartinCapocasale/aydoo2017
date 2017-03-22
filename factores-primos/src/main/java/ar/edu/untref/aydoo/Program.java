package ar.edu.untref.aydoo;

public class Program {


	public static final void main(String[] args)  {
		
		
		int numeroIngresado = Integer.parseInt(args[0]);
		FactoresPrimos factor = new FactoresPrimos();
	
		
			if(numeroIngresado < 2 ){
				System.out.println("ingrese un numero mayor a 1");
			}
		
			else{
				factor.calcularFactor(numeroIngresado);
				System.out.println("Factores primos " + numeroIngresado + ":" + factor.imprimir());
				
			} 
	}			

}

