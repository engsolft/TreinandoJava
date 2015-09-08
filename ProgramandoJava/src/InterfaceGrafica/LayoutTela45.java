package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutTela45 extends JFrame {
	
	JButton jb = new JButton("Teste");
	JButton jb2 = new JButton("Teste 2");
	JButton jb3 = new JButton("Teste 3");
	
	
	public LayoutTela45(){
		setLayout(new BorderLayout());
				
		add(BorderLayout.NORTH,jb);
		add(BorderLayout.EAST,jb2);
		add(BorderLayout.CENTER,jb3);
		
		
		
		
		setTitle("Título da Janela");//Título da Janela
		setSize(500, 400);///Largura e altura da janela em pixels
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha o programa e a janela criada
		setLocationRelativeTo(null);//manipulação da janela centralizada
		setResizable(false);//fixa o tamanho da janela
		setVisible(true);//torna visível a janela
		
		
		
			
		
	}	

	public static void main(String[] args) {
		new LayoutTela45();
		

	}

}
