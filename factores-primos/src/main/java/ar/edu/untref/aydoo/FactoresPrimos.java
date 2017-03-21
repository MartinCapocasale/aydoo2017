import java.util.Scanner;


public class FactoresPrimos {

	public static void main(String[] args){
				
		System.out.println("Ingrese un numero:");
		Scanner ingreso = new Scanner(System.in);
		
		int factorPrimo;
		int numero;
		System.out.println(("Factores Primos de " + (numero = ingreso.nextInt())) + ":");
		
		for(factorPrimo = 2; factorPrimo<=numero; factorPrimo++){
			
			while(numero % factorPrimo == 0){
				System.out.println(factorPrimo);
				numero /= factorPrimo;
				
			}
			
		}		
	}

}
