import org.junit.Test;

public class BeneficioTest {
	
	@Test (expected = ExcepcionBeneficio.class)
	public void obtengoUnBeneficioInvalidoMenorA5Porciento() throws ExcepcionBeneficio{
		
		Beneficio nuevoBeneficio = new Beneficio(Tarjeta.PREMIUM, 1);			
		
	}
}
