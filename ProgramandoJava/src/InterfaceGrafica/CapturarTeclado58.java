package InterfaceGrafica;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.management.openmbean.KeyAlreadyExistsException;
import javax.print.attribute.standard.JobOriginatingUserName;
import javax.sql.rowset.JoinRowSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CapturarTeclado58 extends JFrame {
	
	public CapturarTeclado58(){
		
		addKeyListener(new KeyAdapter() {
			
			public void KeyPressed(KeyEvent e){
				
				int cod = e.getKeyCode();
				int tecla = KeyEvent.VK_ENTER;
				
				if (cod == tecla){
					System.out.println("Tecla ENTER pressionada");
				}
				
				//char letra = e.getKeyChar();			
				//System.out.println(letra);
			}
			
		});
		
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(this);
		setVisible(true);
			
	}
	
	public static void main(String[] args) {
		new CapturarTeclado58();
		

	}

}
