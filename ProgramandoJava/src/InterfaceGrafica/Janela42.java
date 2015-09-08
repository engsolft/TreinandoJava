package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Janela42 extends JFrame implements ActionListener{
	
	JButton jb = new JButton("Depositar");
	JButton jb2 = new JButton("Sair");
	
	public void actionPerformed(ActionEvent e){
		if (e.getSource()==jb){
			String num = JOptionPane.showInputDialog(null, "Digite o valor a depositar");
			int valor = Integer.parseInt(num);
			
			System.out.println(valor + valor);
			
		}else{
			if (e.getSource()==jb2){
				System.exit(0);
			}
		}
	}
	
	public Janela42(){
		//JFrame jf = new JFrame();//instanciando o objeto do tipo JFrame
		
		//Configurando a tela/janela
		setTitle("Título da Janela");//Título da Janela
		setSize(500, 400);///Largura e altura da janela em pixels
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//fecha o programa e a janela criada
		setLocationRelativeTo(null);//manipulação da janela centralizada
		setResizable(false);//fixa o tamanho da janela
		setVisible(true);//torna visível a janela
		
		//add ação ao botão
		jb.addActionListener(this);
		jb2.addActionListener(this);

		//configurando botão
		setLayout(null);
		jb.setBounds(100, 200, 100, 60);
		jb2.setBounds(250, 200, 80, 60);
		
		//add botão na janela
		add(jb);
		add(jb2);
		
	}

	public static void main(String[] args) {
		new Janela42();
		

	}

}
