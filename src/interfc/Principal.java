package interfc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal  extends JFrame{
	
	JButton botao1;
	JTextField texto;
	JFrame Principal;
	JPanel painel;

	public Principal(){
		
	
		super("Maquina de Papel");
		setLayout(new FlowLayout());

		
		painel =new JPanel();
		
		
		texto= new JTextField();	
		botao1= new JButton("Executar");
		
		texto.setPreferredSize(new Dimension (100,25));
		 
		


		
		getContentPane().add(texto);
		getContentPane().add(botao1);
		getContentPane().add(painel);
		
		 
		this.texto=texto;
		this. botao1=botao1;
		this.painel=painel;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,500);
		setVisible(true);
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Principal();
		
		
		
		
	}

}
