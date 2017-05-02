public class PasajeDeArgumentos {

		private int numero = 0;
		private String formato = "pretty";
		private String nombreDeArchivo = "";
		private String orden = "";
		private String argumentos[];

		public PasajeDeArgumentos(String args[]) {
			this.setNumero(Integer.parseInt(args[0]));
			this.setArgumentos(args);
		}

		public void analizarArgumentos() {
			int caracteresFormat = 9;
			int caracteresSort = 7;
			int caracteresOutput = 14;

			for (String argumentoActual : argumentos) {
				
				if (argumentoActual.startsWith("--format=")) {
					this.formato = argumentoActual.substring(caracteresFormat).toLowerCase();
				} 
				
				else if (argumentoActual.startsWith("--sort=")) {
					this.orden = argumentoActual.substring(caracteresSort);
				} 
				
				else if (argumentoActual.startsWith("--output-file=")) {
					this.nombreDeArchivo = argumentoActual.substring(caracteresOutput);
				}
			}
		}

		public String getFormato() {
			return formato;
		}

		public String getNombreDeArchivo() {
			return nombreDeArchivo;
		}

		public String getOrden() {
			return orden;
		}

		public int getNumero() {
			return numero;
		}
		
		public void setNumero(int unNumero) {
			this.numero = unNumero;
		}
		
		public void setArgumentos(String args[]) {
			this.argumentos = args;
		}
	}