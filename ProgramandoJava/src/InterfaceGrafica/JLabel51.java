package InterfaceGrafica;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabel51 extends JFrame {
	
	Font grande = new Font("Serif", Font.BOLD,50);
	
	JLabel legenda = new JLabel("Texto");
	
	public JLabel51(){
		
		add(legenda);
		legenda.setFont(grande);
		legenda.setText("outro texto");
		legenda.setHorizontalAlignment(SwingConstants.CENTER);
		
		setTitle("JLabel na Tela");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JLabel51();
		

		
		

	}

}
