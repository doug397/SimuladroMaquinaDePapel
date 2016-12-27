package execucao;

public class Decode {
	
	
	public int decode(String instrucao){
		
		System.out.println("Decodificando Instrucao");
		String codOperacao=instrucao.substring(0,1);
		
		if(codOperacao.equals("1")|| codOperacao.equals("2") || codOperacao.equals("3")|| codOperacao.equals("4") ){
			
			System.out.println("Tipo 1 de instrucao ");
			return 1;
		}else
			if(codOperacao.equals("5")|| codOperacao.equals("6") || codOperacao.equals("7") || codOperacao.equals("8")
					|| codOperacao.equals("9")){
				
				return 2;
			}
			else
				if(codOperacao.equals("A") || codOperacao.equals("B")){
					return 3;
				}
		 
		return 0;
	}
	
	
}
