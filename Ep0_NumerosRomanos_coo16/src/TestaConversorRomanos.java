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
	
	@Test
	public void converte_III_para_3() {
		
		String romano = "III";
		int resultadoEsperado = 3;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_3_para_III() {
		
		int arabico =3;
		String resultadoEsperado = "III";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}

	
	@Test
	public void converte_IV_para_4() {
		
		String romano = "IV";
		int resultadoEsperado = 4;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_4_para_IV() {
		
		int arabico =4;
		String resultadoEsperado = "IV";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_V_para_5() {
		
		String romano = "V";
		int resultadoEsperado = 5;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_5_para_V() {
		
		int arabico =5;
		String resultadoEsperado = "V";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_VI_para_6() {
		
		String romano = "VI";
		int resultadoEsperado = 6;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_6_para_VI() {
		
		int arabico =6;
		String resultadoEsperado = "VI";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_VII_para_7() {
		
		String romano = "VII";
		int resultadoEsperado = 7;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_7_para_VII() {
		
		int arabico =7;
		String resultadoEsperado = "VII";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}

}
