package InterfaceGrafica;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayout46 extends JFrame {
	
	JButton jb = new JButton("Teste");
	JButton jb2 = new JButton("Teste 2");
	
	public FlowLayout46(){ 
		
	setLayout(new FlowLayout(FlowLayout.LEFT));
	add(jb);
	add(jb2);
	
	setTitle("T�tulo da Janela");//T�tulo da Janela
	setSize(500, 400);///Largura e altura da janela em pixels
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha o programa e a janela criada
	setLocationRelativeTo(null);//manipula��o da janela centralizada
	setResizable(false);//fixa o tamanho da janela
	setVisible(true);//torna vis�vel a janela
	}
	
	public static void main(String[] args) {
		new FlowLayout46();
		

	}

}
