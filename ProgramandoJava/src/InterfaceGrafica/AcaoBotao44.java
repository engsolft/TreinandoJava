package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class AcaoBotao44 extends JFrame implements ActionListener {

	JButton jb = new JButton("OK");
	JButton jb2 = new JButton("Sair");
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==jb){
		JOptionPane.showMessageDialog(null, "Aula ActionListener");
	}
		if (e.getSource()==jb2){
			System.exit(0);			
		}
		
	}		
	
	public AcaoBotao44(){
	
	jb.addActionListener(this);
	jb2.addActionListener(this);
	
	setLayout(null);
	jb.setBounds(100, 300, 100, 60);
	jb2.setBounds(400, 300, 100, 60);
	add(jb);
	add(jb2);
		
	
	//JFrame jf = new JFrame();//instanciando o objeto do tipo JFrame
	setTitle("Título da Janela");//Título da Janela
	setSize(500, 400);///Largura e altura da janela em pixels	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha o programa e a janela criada
	setLocationRelativeTo(null);//manipulação da janela centralizada
	setResizable(false);//fixa o tamanho da janela
	setVisible(true);//torna visível a janela

	}
	
	public static void main(String[] args) {
		new AcaoBotao44();			
	}

}
