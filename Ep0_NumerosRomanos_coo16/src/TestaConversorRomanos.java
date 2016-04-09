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

	
	@Test
	public void converte_IX_para_9() {
		
		String romano = "IX";
		int resultadoEsperado = 9;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_9_para_IX() {
		
		int arabico =9;
		String resultadoEsperado = "IX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_X_para_10() {
		
		String romano = "X";
		int resultadoEsperado = 10;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_10_para_X() {
		
		int arabico =10;
		String resultadoEsperado = "X";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XI_para_11() {
		
		String romano = "XI";
		int resultadoEsperado = 11;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_11_para_XI() {
		
		int arabico =11;
		String resultadoEsperado = "XI";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XIV_para_14() {
		
		String romano = "XIV";
		int resultadoEsperado = 14;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_14_para_XIV() {
		
		int arabico =14;
		String resultadoEsperado = "XIV";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XV_para_15() {
		
		String romano = "XV";
		int resultadoEsperado = 15;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_15_para_XV() {
		
		int arabico =15;
		String resultadoEsperado = "XV";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_XVI_para_16() {
		
		String romano = "XVI";
		int resultadoEsperado = 16;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_16_para_XVI() {
		
		int arabico =16;
		String resultadoEsperado = "XVI";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XIX_para_19() {
		
		String romano = "XIX";
		int resultadoEsperado = 19;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_19_para_XIX() {
		
		int arabico =19;
		String resultadoEsperado = "XIX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XX_para_20() {
		
		String romano = "XX";
		int resultadoEsperado = 20;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_20_para_XX() {
		
		int arabico =20;
		String resultadoEsperado = "XX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XXII_para_22() {
		
		String romano = "XXII";
		int resultadoEsperado = 22;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_22_para_XXII() {
		
		int arabico =22;
		String resultadoEsperado = "XXII";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	
	@Test
	public void converte_XXIX_para_29() {
		
		String romano = "XXIX";
		int resultadoEsperado = 29;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_29_para_XXIX() {
		
		int arabico =29;
		String resultadoEsperado = "XXIX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XXX_para_30() {
		
		String romano = "XXX";
		int resultadoEsperado = 30;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_30_para_XXX() {
		
		int arabico =30;
		String resultadoEsperado = "XXX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XXXV_para_35() {
		
		String romano = "XXXV";
		int resultadoEsperado = 35;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_35_para_XXXV() {
		
		int arabico =35;
		String resultadoEsperado = "XXXV";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_XXXIX_para_39() {
		
		String romano = "XXXIX";
		int resultadoEsperado = 39;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_39_para_XXXIX() {
		
		int arabico =39;
		String resultadoEsperado = "XXXIX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_XL_para_40() {
		
		String romano = "XL";
		int resultadoEsperado = 40;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_40_para_XL() {
		
		int arabico =40;
		String resultadoEsperado = "XL";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_L_para_50() {
		
		String romano = "L";
		int resultadoEsperado = 50;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_50_para_L() {
		
		int arabico =50;
		String resultadoEsperado = "L";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_LIV_para_54() {
		
		String romano = "LIV";
		int resultadoEsperado = 54;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_54_para_LIV() {
		
		int arabico =54;
		String resultadoEsperado = "LIV";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_LIX_para_59() {
		
		String romano = "LIX";
		int resultadoEsperado = 59;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_59_para_LIX() {
		
		int arabico =59;
		String resultadoEsperado = "LIX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_LX_para_60() {
		
		String romano = "LX";
		int resultadoEsperado = 60;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_60_para_LX() {
		
		int arabico =60;
		String resultadoEsperado = "LX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_LXX_para_70() {
		
		String romano = "LXX";
		int resultadoEsperado = 70;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_70_para_LXX() {
		
		int arabico =70;
		String resultadoEsperado = "LXX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XC_para_90() {
		
		String romano = "XC";
		int resultadoEsperado = 90;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_90_para_XC() {
		
		int arabico =90;
		String resultadoEsperado = "XC";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_XCIX_para_99() {
		
		String romano = "XCIX";
		int resultadoEsperado = 99;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_99_para_XCIX() {
		
		int arabico =99;
		String resultadoEsperado = "XCIX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_C_para_100() {
		
		String romano = "C";
		int resultadoEsperado = 100;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_100_para_C() {
		
		int arabico =100;
		String resultadoEsperado = "C";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_CIX_para_109() {
		
		String romano = "CIX";
		int resultadoEsperado = 109;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_109_para_CIX() {
		
		int arabico =109;
		String resultadoEsperado = "CIX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_CLXXXVIII_para_188() {
		
		String romano = "CLXXXVIII";
		int resultadoEsperado = 188;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_188_para_CLXXXVIII() {
		
		int arabico =188;
		String resultadoEsperado = "CLXXXVIII";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_CLXXXIX_para_189() {
		
		String romano = "CLXXXIX";
		int resultadoEsperado = 189;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_189_para_CLXXXIX() {
		
		int arabico =189;
		String resultadoEsperado = "CLXXXIX";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_CCCXXXVIII_para_338() {
		
		String romano = "CCCXXXVIII";
		int resultadoEsperado = 338;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_338_para_CCCXXXVIII() {
		
		int arabico =338;
		String resultadoEsperado = "CCCXXXVIII";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void converte_CD_para_400() {
		
		String romano = "CD";
		int resultadoEsperado = 400;
		int resultado = Conversor.deRomanoParaArabico(romano);
		
		assertEquals(resultadoEsperado, resultado);
	}
	@Test
	public void converte_400_para_CD() {
		
		int arabico =400;
		String resultadoEsperado = "CD";
		String resultado = Conversor.deArabicoParaRomano(arabico);
		
		assertEquals(resultadoEsperado, resultado);
	}
}
