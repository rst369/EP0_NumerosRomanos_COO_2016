
public class Conversor {


	public static int deRomanoParaArabico(String numeroRomano){
		int arabico =0;
		
		int tamanho=numeroRomano.length();
		
		for(int i=0;i<tamanho;i++){
			arabico+=converteLetraRomanaNumero(numeroRomano.charAt(i));
		}
		
		
		return arabico;
	}
	 public static String deArabicoParaRomano(int numeroArabico){
		 String romano="";
		 int potencia=1;
		 

			while(numeroArabico>0)
			{
				int digito = (numeroArabico)%10;
				digito = digito *potencia;
				while(digito>0){
					String r = converteNumeroLetraRomana(digito);
					romano += r;
				}
				
	  			numeroArabico= numeroArabico/10;
	  			potencia = potencia*10;
	  			
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
	 
	 
	private static int converteLetraRomanaNumero(char r){
		int a =0;
		
		switch(r){
		case 'I':{ return 1;}
		default: {return a;}
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
