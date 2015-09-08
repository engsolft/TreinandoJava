package InterfaceGrafica;

import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox53 extends JFrame {
	
	JCheckBox teste = new JCheckBox("Título");
	
	public CheckBox53(){
		setLayout(new FlowLayout());		
		add(teste);	
		
		System.out.println(teste.isSelected());
		
		setTitle("Caixa de Texto");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CheckBox53();
		

	}

}
