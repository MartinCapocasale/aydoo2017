public class Program {
	
	public static final void main(String args[]) {
		 
		FactoresPrimos factoresPrimos = new FactoresPrimos();
		PasajeDeArgumentos entrada = new PasajeDeArgumentos(args);
		entrada.analizarArgumentos();
		
		String numeroFactorizado = factoresPrimos.calcularFactor(entrada.getNumero());
		ConfiguracionDeArgumentos salida = new ConfiguracionDeArgumentos();
		String resultadoFormateado = salida.setArgumentos(entrada.getNumero(), entrada.getFormato(), numeroFactorizado, entrada.getOrden());
		
		if(entrada.getNombreDeArchivo() != "") {			
			salida.imprimirEnArchivo(entrada.getNombreDeArchivo(), resultadoFormateado);
		}
		else{			
			salida.imprimirEnConsola(resultadoFormateado);
		}
	}	
}