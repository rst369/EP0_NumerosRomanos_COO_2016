
public class Conversor {

	public static String [] ordemRomanos ={"D","CD","C","XC","L","XL","X","IX","V","IV","I"};

	public static int deRomanoParaArabico(String numeroRomano){
		int arabico =0;
		int anterior=0;
		int tamanho=numeroRomano.length();
		
//		System.out.println("romano: "+numeroRomano);
		
		for(int i=0;i<tamanho;i++){
			
			int convertido = converteLetraRomanaNumero(numeroRomano.charAt(i)+"");
			if(anterior==0 || convertido<=anterior)
				arabico+= convertido;
			else 
				arabico+= (convertido-anterior)-anterior;
			
//			System.out.print("arabico: "+arabico+" convertido: "+convertido+" anterior: "+anterior);
			
			anterior = convertido;
		}
//		System.out.println();
//		System.out.println("arabico: "+arabico);
//		System.out.println("-------------------------------------------");
		return arabico;
	}
	 public static String deArabicoParaRomano(int numeroArabico){
		 String romano="";
		
				
				/**
				 * pegar maior valor possivel para subtrair
				 */
		 	
//			System.out.println("arabico: "+numeroArabico);
		 	while(numeroArabico>0){
		 		int i=0;
		 		while(i<ordemRomanos.length){
					
		 			String r = ordemRomanos[i];
		 			int nConvertido = deRomanoParaArabico(r);
		 			
		 			while(nConvertido<=numeroArabico){
		 				numeroArabico -= nConvertido; 
						romano+=r;
		 			}
					
					
//					System.out.println(i+": r ="+r+" nConvertido="+nConvertido+" romano="+romano);
		 			if(numeroArabico==0)
		 				break;
//		 			if(nConvertido!=numeroArabico)
		 				i++;
				}
		 	}
		 	
			
		 return romano;
	 }
	
	
	 
	 
	private static int converteLetraRomanaNumero(String r){
		int a =0;
		
		if(r.equals("I")) return 1;
		else if(r.equals("V")) return 5;
		else if(r.equals("X")) return 10;
		else if(r.equals("L")) return 50;
		else if(r.equals("C")) return 100;
		else if(r.equals("D")) return 500;
		else return a;
		
	}
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
