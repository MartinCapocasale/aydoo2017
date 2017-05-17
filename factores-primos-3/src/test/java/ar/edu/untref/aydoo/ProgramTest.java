import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;


public class ProgramTest {
	
	@Test
	public void testFactoresPrimosFormatoPrettyImpresoEnArchivo() throws IOException {

		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);

		String[] argumento = { "90", "--format=pretty", "--output-file=salida.txt" };
		Program.main(argumento);

		String cadena = "";
		String resultado = "";
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado + cadena;
		}
		bufferedReader.close();

		 Assert.assertEquals("Factores primos 90: 2 3 3 5 ", resultado);
	}
	
	@Test
	public void testFactoresPrimos90FormatoQuietImpresoEnArchivo() throws IOException {

		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);

		String[] argumento = { "90", "--format=quiet", "--output-file=salida.txt"};
		Program.main(argumento);
		String cadena = "";
		String resultado = "";
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado  + cadena + "\n";
		}
		bufferedReader.close();

		Assert.assertEquals("5\n3\n3\n2\n", resultado);
	}
	
	@Test
	public void testFactoresPrimos90FormatoPrettyMayusculaImpresoEnArchivo() throws IOException {

		String[] argumento = { "90", "--format=PRETTY", "--output-file=salida.txt"};
		Program.main(argumento);
		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);
		String cadena = "";
		String resultado = "";
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado + cadena;
		}
		bufferedReader.close();

		Assert.assertEquals("Factores primos 90: 2 3 3 5 ", resultado);
	}
	
	@Test
	public void testFactoresPrimosImpresoEnArchivoConParametrosEnOrdenInverso() throws IOException {
	
		FileReader lectorDeArchivo = new FileReader("salida.txt");
		BufferedReader bufferedReader = new BufferedReader(lectorDeArchivo);

		String[] argumento = { "90", "--output-file=salida.txt", "--format=quiet"};
		Program.main(argumento);
		String cadena = "";
		String resultado = "";
		while ((cadena = bufferedReader.readLine()) != null) {
			resultado = resultado  + cadena + "\n";
		}
		bufferedReader.close();

		Assert.assertEquals("5\n3\n3\n2\n", resultado);
	}

}