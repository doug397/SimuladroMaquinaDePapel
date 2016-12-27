package execucao;
import execucao.Decode;



public class UnidadeControle {
	
	public Decode decode=new Decode();
	public UnidadeLogicaAritimetica UAL= new UnidadeLogicaAritimetica();
	
	
	
	public void identifica(String instrucao){
		
		int tipoInstrucao=decode.decode(instrucao);
//	while(){
		switch(tipoInstrucao){
			
		case 1:System.out.println("Carregamento");
		UAL.Executando(instrucao);
		break;
		case 2:System.out.println("Operacao Aritimetica"); 
		UAL.Executando(instrucao);
		break;
		case 3:System.out.println("Operacao Logica");
		UAL.Executando(instrucao);
		break;
		case 0:System.out.println("Halt");
			
	//	}
		
		
	
		}
		
	}

}
