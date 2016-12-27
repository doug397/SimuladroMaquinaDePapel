package testArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo {
	
	
	public static void main(String[] args){
		
			System.out.println("Abrindo arquivo");
		
		try {
		      FileReader arq = new FileReader("instrucao.txt");
		      BufferedReader lerArq = new BufferedReader(arq);
		 
		      String linha = lerArq.readLine(); // l� a primeira linha
		      // a vari�vel "linha" recebe o valor "null" quando o processo
		      // de repeti��o atingir o final do arquivo texto
		      
		      while (linha != null) {
		    	  // linha recebe cada linha do codigo
		    	
		    	  
		    	 if(linha.length()==4){ 
		    	 System.out.println(linha);
		    	  
		    	  
		   // 	  System.out.printf("%s\n", linha);
		     // l� da segunda at� a �ltima linha
		       
		    	 }
		    	 linha = lerArq.readLine();
		      }
		 
		      arq.close();
		      
		      
		    } catch (IOException e) {
		        System.err.printf("Erro na abertura do arquivo: %s.\n",
		          e.getMessage());
		        
		    }
	}
}
