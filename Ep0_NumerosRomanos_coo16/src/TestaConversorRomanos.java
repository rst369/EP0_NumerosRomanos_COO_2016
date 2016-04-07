import static org.junit.Assert.*;

import org.junit.Test;



public class TestaConversorRomanos {

	@Test
	public void testeConverteIparaUm() {
		
		int resultado = Conversor.deRomanoParaArabico("I");
		int resultadoEsperado = 1;
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void testeConverteUmparaI() {
		
		String resultado = Conversor.deArabicoParaRomano(1);
		String resultadoEsperado = "I";
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void testeConverteIIparaDois() {
		
		int resultado = Conversor.deRomanoParaArabico("II");
		int resultadoEsperado = 2;
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void testeConverteDoisparaII() {
		
		String resultado = Conversor.deArabicoParaRomano(2);
		String resultadoEsperado = "II";
		assertEquals(resultadoEsperado, resultado);
	}

}
