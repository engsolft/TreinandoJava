package InterfaceGrafica;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton54 extends JFrame {
	
	JRadioButton masc = new JRadioButton("Masculino", true);
	JRadioButton fem = new JRadioButton("Feminino", true);
	
	ButtonGroup grupo = new ButtonGroup();
	
	public RadioButton54(){
		setLayout(new FlowLayout());	
		add(masc);
		add(fem);
		
		grupo.add(masc);
		grupo.add(fem);
		
		setTitle("Caixa de Texto");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);

		
	}

	public static void main(String[] args) {
		new RadioButton54();
	
	

	}

}
