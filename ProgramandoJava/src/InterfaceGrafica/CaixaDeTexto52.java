package InterfaceGrafica;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CaixaDeTexto52 extends JFrame{
	
	JTextField caixa = new JTextField();
	JTextField caixa2 = new JTextField();
	Font fonte = new Font("Arial", Font.BOLD,50);
	
	public CaixaDeTexto52(){
		setLayout(new FlowLayout());
		
		add(caixa);
		add(caixa2);
		caixa.setText("Aula");
		caixa2.setText("Aula2");
		caixa.setFont(fonte);
		caixa2.setFont(fonte);
		System.out.println(caixa.getText());
		
		setTitle("Caixa de Texto");
		setSize(500,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CaixaDeTexto52();
		

	}

}
