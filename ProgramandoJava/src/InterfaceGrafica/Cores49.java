package InterfaceGrafica;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Cores49 extends JFrame {
	
	JButton jb = new JButton("Texto");
	Font fonte = new Font("Arial",Font.ITALIC | Font.BOLD,100);
	Color cor = new Color(234,233,22);
	Color cor2 = new Color(201,20,255);
	
	public Cores49(){
		
		jb.setForeground(cor);
		jb.setBackground(cor2);
		
		
		jb.setFont(fonte);
		add(jb);// add o botão            
		setTitle("Fonte do Texto"); //Título da Janela
		setSize(600,500); //Tamanho da Janela
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //fechamento da Janela pelo "X"
		setLocationRelativeTo(null); // centraliza a Janela
		setVisible(true); // torna visível a janela				
		
	}

	public static void main(String[] args) {
		new Cores49();
		
	}
}
