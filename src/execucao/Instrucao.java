package execucao;

public class Instrucao extends Byte {
	

	private String instrucao;


	/*converte a Instrucao*/

public String converteToString(String string){
	
	String newInstrucao= string.toString();
	
	return newInstrucao;
}




/*Valida Instrucao*/
	public int validaInstrucao(String  tamInstrucao){
		
		if(tamInstrucao.length()==4){
			System.out.println("Instrucao Valida");
			return 1;
		}else{
			return 0;
		}
		
	}
	
	/*** verifica tamanho da palavra em BYTES*/
	public int verificaTamanho(int i){
		
		if(i==BYTES_16){
			System.out.println("TAmanho 16 bits");
			
			return i;
		}
		else
			if(i==BYTES_32){
			System.out.println("TAmanho 32 bits");
			
			return i;
		}
			else{
				System.out.println("TAmanho 64 bits");
				return i;
			}
	}




	/**
	 * @return the instrucao
	 */
	public String getInstrucao() {
		return instrucao;
	}




	/**
	 * @param instrucao the instrucao to set
	 */
	public void setInstrucao(String instrucao) {
		this.instrucao = instrucao;
	}



}
