package execucao;
import execucao.Ri;





public class Cpu {
	
	
	public  Ri ri= new Ri();
	public Instrucao instrucao= new Instrucao();
	public UnidadeLogicaAritimetica ual= new UnidadeLogicaAritimetica();
	public UnidadeControle uc= new  UnidadeControle();
	
	
	
	public Cpu(){
		
	}
	
	
	public Cpu(Ri ri,Instrucao instrucao, UnidadeLogicaAritimetica ual,UnidadeControle uc){
		this.instrucao=instrucao;
		this.ri=ri;
		this.ual=ual;
		this.uc=uc;
	}
	
	
	
	
	public  String execucao(String instrucao){
		
		System.out.println("Buscando Instrucao");
		System.out.println("Ri "+instrucao);
		
		
		uc.identifica(instrucao);
		
		
		
		
		
		
		
		
		return instrucao;
		
	}

	
	
	

}
