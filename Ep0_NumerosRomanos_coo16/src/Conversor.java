
public class Conversor {

	public static String [] ordemRomanos ={"V","IV","I"};

	public static int deRomanoParaArabico(String numeroRomano){
		int arabico =0;
		int anterior=0;
		int tamanho=numeroRomano.length();
		
		System.out.println("romano: "+numeroRomano);
		
		for(int i=0;i<tamanho;i++){
			
			int convertido = converteLetraRomanaNumero(numeroRomano.charAt(i)+"");
			if(anterior==0 || convertido<=anterior)
				arabico+= convertido;
			else 
				arabico= convertido-arabico;
			
			System.out.print("arabico: "+arabico+" convertido: "+convertido+" anterior: "+anterior);
			
			anterior = convertido;
		}
		System.out.println("arabico: "+arabico);
		System.out.println("-------------------------------------------");
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
		 			if(nConvertido<=numeroArabico){
		 				numeroArabico -= nConvertido; 
						romano+= ordemRomanos[i];
		 			}
					
					
//					System.out.println(i+": r ="+r+" nConvertido="+nConvertido+" romano="+romano);
					i++;
				}
		 	}
		 	
			
		 return romano;
	 }
	
	 private static String converteNumeroLetraRomana(int n){
			String r ="";
			
			switch(n){
			case 1:{ return "I";}
			case 4:{return "IV";}
			default: {return r;}
			}
			
		}
	 
	 
	private static int converteLetraRomanaNumero(String r){
		int a =0;
		
		if(r.equals("I")) return 1;
		else if(r.equals("V")) return 5;
		else return a;
		
	}
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
