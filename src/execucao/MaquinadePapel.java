package execucao;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import interfc.Principal;





public class MaquinadePapel  {
	
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		Scanner s= new Scanner(System.in);
		System.out.println("Digite a Instrucao");
		String instrucao=s.nextLine().toUpperCase();
	
	
		 Cpu cpu= new Cpu();
	

	while(!instrucao.equals("fim")){
		
			cpu.instrucao.setInstrucao(instrucao);
			cpu.instrucao.validaInstrucao(instrucao);
			cpu.ri.setRi(cpu.instrucao.getInstrucao());

			cpu.execucao(cpu.ri.getRi());
			
			
		
			System.out.println("Digite a Instrucao");
		    instrucao=s.nextLine();
	
	}
	
	

		
	
		
		
		
		
	
		 
		
	
		

	}
	
	

}
