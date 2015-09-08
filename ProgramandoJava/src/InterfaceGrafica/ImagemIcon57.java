package InterfaceGrafica;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ImagemIcon57 extends JFrame{
	
	ImageIcon img = new ImageIcon(getClass().getResource("Adria.jpg"));	
	JLabel jl = new JLabel(img);
	JButton jb = new JButton("OK");
	
	public ImagemIcon57(){
		//setLayout(null);
		add(jl);
		//add(jb);
		
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ImagemIcon57();
		

	}

}
