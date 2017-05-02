
public class ConfiguracionDeArgumentos {
	

	public String setArgumentos(int numero, String formato, String resultadoFactoreo, String orden){
		String resultado = "";
		
		switch (formato.toLowerCase()) {
			case "pretty":
				resultado = formatearPretty(resultadoFactoreo, numero, orden);
			break;
		
			case "quiet":
				resultado = formatearQuiet(resultadoFactoreo, orden);
			break;
		
			default:
				resultado = "Formato no aceptado. Las opciones posibles son: pretty o quiet.";
			break;
		}
		return resultado;

	}
	private String formatearPretty(String resultado, int numero, String orden) {

		if (orden.equals("desc")) {
			resultado = invertirPretty(resultado);
		}
		
		return "Factores primos " + numero + ": " + resultado;
	}

	private String formatearQuiet(String resultado, String orden) {
		if(orden.equals("desc") || orden.equals("")){
			resultado = invertir(resultado);
		}		
		resultado = resultado.replace(" ", "\n");
			
		return resultado;
	}
	
    private String invertir(String palabra){
		String resultado = "";
		
		for(int i = palabra.length()-2; i >= 0; i--){
			resultado = resultado + palabra.substring(i,i+1);
		}	
		return resultado;
	}

	private String invertirPretty(String palabra) {
		String palabraInvertida = "";

		for (int i = palabra.length() - 2; i >= 0; i--) {
			palabraInvertida = palabraInvertida + palabra.substring(i, i + 1);
		}
		
		return palabraInvertida;
	}
	
	public void imprimirEnConsola(String texto) {
		System.out.println(texto);
	}

}
