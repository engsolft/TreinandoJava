package InterfaceGrafica;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Intervalo61 extends JFrame{
	
	Font fonte = new Font("Arial", Font.BOLD,150);
	JLabel num = new JLabel("0");
	
	public Intervalo61(){
		
		num.setFont(fonte);
		num.setHorizontalAlignment(SwingConstants.CENTER);
		add(num);
		
		setTitle("Programa Soma");
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void contagem(){
		int n = 0;
		
		while(true){
		num.setText(n+"");
		n++;
		try{
			Thread.sleep(1000);
			}catch(Exception erro){}
		}
	}

	public static void main(String[] args) {
		Intervalo61 obj = new Intervalo61();
		obj.contagem();
		

	}

}
