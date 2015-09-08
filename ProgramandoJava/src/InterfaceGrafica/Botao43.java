package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Botao43 extends JFrame implements ActionListener {
	
	JButton jb = new JButton("OK");
	JButton jb2 = new JButton("OK 2");
	JButton jb3 = new JButton("Sair");
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==jb){
			JOptionPane.showMessageDialog(null, "Voc� clicou no OK");
		}else{
			if (e.getSource()==jb2){
				JOptionPane.showMessageDialog(null, "Voc� clicou no OK 2");				
			}else{
				if (e.getSource()==jb3){
					System.exit(0);								
				}				
			}
		}
	}
	
	public Botao43(){
		
		//configurando janela
		setTitle("TESTANDO BOT�O");									//T�tulo da Janela
		setSize(600,500);						//Dimens�es da Janela
		setDefaultCloseOperation(EXIT_ON_CLOSE);//Clicar no "X" da Janela fecha a aplica��o
		setLocationRelativeTo(null);//Centralizar Janela
		setResizable(false);
		setVisible(true);
		
		//add a��o do bot�o
		jb.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
		//configurando bot�o
		setLayout(null);
		jb.setBounds(100, 350, 80, 40);
		jb2.setBounds(200, 350, 80, 40);
		jb3.setBounds(300, 350, 80, 40);
		
		//add bot�o
		add(jb);
		add(jb2);
		add(jb3);	
	}
	
	

	public static void main(String[] args) {
		new Botao43();

	}

}
