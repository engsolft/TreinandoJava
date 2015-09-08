package InterfaceGrafica;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FonteTexto48 extends JFrame{
	
	JButton botao = new JButton("Texto");
	Font fonte = new Font("Corrier New",Font.ITALIC | Font.BOLD,100);
	
	public FonteTexto48(){
		
		botao.setFont(fonte);
		add(botao);// add o botão            
		setTitle("Fonte do Testo"); //Título da Janela
		setSize(600,500); //Tamanho da Janela
		setDefaultCloseOperation(EXIT_ON_CLOSE);  //fechamento da Janela pelo "X"
		setLocationRelativeTo(null); // centraliza a Janela
		setVisible(true); // torna visível a janela
				
		//botao.setFont(fonte);
		
		
	}
	

	public static void main(String[] args){
		new FonteTexto48();		
		
	}
}
		
		
			
			
		

	

	
