package InterfaceGrafica;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarFile;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgramaSoma60 extends JFrame {
	
	JTextField num1 = new JTextField();
	JTextField num2 = new JTextField();
	JLabel mais = new JLabel("  +");
	JLabel resultado = new JLabel();
	JLabel resultado2 = new JLabel();
	JButton soma = new JButton("=");	
	JButton subtracao = new JButton("-");	
	Font fonte = new Font("Arial", Font.BOLD,50);
	
	public ProgramaSoma60(){
		
            //adiocionando ação ao botão soma
		soma.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				int soma = n1 + n2;
				resultado.setText(soma+"");				
			}
		});
	    //adiocinando ação ao botão subtração	
		subtracao.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(num1.getText());
				int n2 = Integer.parseInt(num2.getText());
				int sub = n1 - n2;				
				resultado2.setText(sub+"");				
			}
		});
						
		//adicionando botões e entrada de textos (dados)
		setLayout(new GridLayout(1,5));
		add(num1);
		add(mais);
		add(num2);
		add(soma);
		add(resultado);
		add(subtracao);
		add(resultado2);
                
                //setando fonte		
		num1.setFont(fonte);
		mais.setFont(fonte);
		num2.setFont(fonte);
		soma.setFont(fonte);
		resultado.setFont(fonte);
		resultado2.setFont(fonte);
		subtracao.setFont(fonte);
		
                //configurando tela
		setTitle("Programa Soma");
		setSize(600,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);		
	}
	public static void main(String[] args) {
		new ProgramaSoma60();
	}
}