import static org.junit.Assert.*;

import org.junit.Test;



public class TestaConversorRomanos {

	@Test
	public void converte_I_para_1() {
		
		int resultado = Conversor.deRomanoParaArabico("I");
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_1_para_I() {
		
		String resultado = Conversor.deArabicoParaRomano(1);
		String resultadoEsperado = "I";
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_II_para_2() {
		
		int resultado = Conversor.deRomanoParaArabico("II");
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_2_para_II() {
		
		String resultado = Conversor.deArabicoParaRomano(2);
		String resultadoEsperado = "II";
		assertEquals(resultadoEsperado, resultado);
	}

}
