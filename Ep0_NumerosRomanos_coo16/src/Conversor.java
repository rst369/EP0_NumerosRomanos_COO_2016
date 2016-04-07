
public class Conversor {

	public static String [] ordemRomanos ={"I"};

	public static int deRomanoParaArabico(String numeroRomano){
		int arabico =0;
		
		int tamanho=numeroRomano.length();
		
		for(int i=0;i<tamanho;i++){
			arabico+=converteLetraRomanaNumero(numeroRomano.charAt(i)+"");
		}
		
		
		return arabico;
	}
	 public static String deArabicoParaRomano(int numeroArabico){
		 String romano="";
		 int potencia=1;
		 
				
				/**
				 * pegar maior valor possivel para subtrair
				 */
		 	
			
		 	while(numeroArabico>0){
		 		int i=0;
		 		while(i<ordemRomanos.length){
					
		 			String r = ordemRomanos[i];
					numeroArabico -= converteLetraRomanaNumero(r);
					romano+= ordemRomanos;
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
		else return a;
		
	}
		
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
