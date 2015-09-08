package InterfaceGrafica;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox55 extends JFrame {
	
	JComboBox<String> combo = new JComboBox<String>();
	
	public ComboBox55(){
		setLayout(new FlowLayout());
		
		add(combo);
		combo.addItem("Brasil");
		combo.addItem("Argetina");
		combo.addItem("Uruguai");
		//combo.setSelectedIndex(2);
		combo.setSelectedItem("Argetina");
		//combo.getSelectedItem();
		
		System.out.println(String.valueOf(combo.getSelectedItem()));
		
	
		setTitle("Caixa de Texto");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ComboBox55();
		

	}

}
