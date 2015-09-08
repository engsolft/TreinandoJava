package InterfaceGrafica;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayout47 extends JFrame {
	JButton jb = new JButton("1");
	JButton jb2 = new JButton("2");
	JButton jb3 = new JButton("3");
	JButton jb4 = new JButton("4");
	
	public GridLayout47(){
		
		setLayout(new GridLayout(2,3));
		add(jb);
		add(jb2);
		add(jb3);
		add(jb4);
		
	setTitle("Título da Janela");//Título da Janela
	setSize(500, 400);///Largura e altura da janela em pixels
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha o programa e a janela criada
	setLocationRelativeTo(null);//manipulação da janela centralizada
	setResizable(false);//fixa o tamanho da janela
	setVisible(true);//torna visível a janela

	}
	
	public static void main(String[] args) {
		new GridLayout47();
		

	}

}
