package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Menu62 extends JFrame {
	
	JMenuBar barra = new JMenuBar();
	JMenu menu1 = new JMenu("Opções");
	JMenu menu2 = new JMenu("Sair");
	JMenu menu3 = new JMenu("Ajuda");
	
	JMenuItem item1 = new JMenuItem("Exit");
	JMenuItem item2 = new JMenuItem("Cadastrar Novo Detento");
	JMenuItem item3 = new JMenuItem("Alterar Dados Detento");
	
	public Menu62(){
		
		setJMenuBar(barra);
		barra.add(menu1);
		barra.add(menu2);
		barra.add(menu3);
		
		menu1.add(item2);
		menu2.add(item1);
		menu1.add(item3);
		
		item1.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);				
			}
		});
		
		item2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				String nome = JOptionPane.showInputDialog(null, "Nome do Detento");
				
			}
		});
		
		setTitle("Sistema Prisional - SP");
		setSize(600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Menu62();
		

	}

}
