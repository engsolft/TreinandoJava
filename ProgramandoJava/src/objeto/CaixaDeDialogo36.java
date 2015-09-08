package objeto;

import javax.swing.JOptionPane;

public class CaixaDeDialogo36 {
	
	public static void caixinha1(){
		JOptionPane.showMessageDialog(null,"Bem Vindo a Vídeo Aula");
		String leitura = JOptionPane.showInputDialog("Qual o seu nome?");
		System.out.println(leitura);
	}
	
	public static void caixinha2(){
		int resposta = JOptionPane.showConfirmDialog(null, "Você é casado?");
		System.out.println(resposta);
		
		if (resposta == 0){
			System.out.println("CASADO");			
		}else{
			System.out.println("NÃO É CASADO");
		}
	}
	
	public static void main(String[] args) {
		//caixinha1();
		caixinha2();
		
		
		
		
		

	}

}
