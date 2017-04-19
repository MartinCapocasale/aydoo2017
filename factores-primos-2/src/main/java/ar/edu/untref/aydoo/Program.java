import java.util.Iterator;
import java.util.LinkedList;


public class Program {
	
	public static final void main(String args[]){
		 
        int numero = 0;
        
        try {
            numero = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException excepcion) {
            System.out.println("El valor debe ser un entero");
            System.exit(1);
        }
        
        FactoresPrimos factor = new FactoresPrimos();
        factor.calcularFactor(numero);
        LinkedList<Integer> resultado  = factor.imprimir();

		Iterator<Integer> it = resultado.iterator();

		String formato = null ;
		
		if (args.length == 1){
			formato = "--format=pretty";
		} 
		
		else {
			formato = args[1];
		}
			
        switch (formato.toLowerCase()) {
         	
        	case "--format=pretty":
 		    System.out.print("Factores primos: " + numero + ": ");
 			
 		    	while (it.hasNext()){
 		    		System.out.print(it.next() + " ");
 		    	}
            break;
            
         	case "--format=quiet":
 		     System.out.print("Factores primos: " + numero + ": ");
        	 System.out.println();
        	 
        	 	for(int j = resultado.size() - 1; j >= 0; j--){
        	 		System.out.println(resultado.get(j));
        	 	}
        	break;
        
         	default:
        	 System.out.println("Formato no aceptado. Las opciones posibles son: pretty o quiet.");
        }
        System.out.println();
    }

}
