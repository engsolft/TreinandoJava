package objeto;

import javax.swing.JOptionPane;

public class CaixaDeDialogo36 {
	
	public static void caixinha1(){
		JOptionPane.showMessageDialog(null,"Bem Vindo a V�deo Aula");
		String leitura = JOptionPane.showInputDialog("Qual o seu nome?");
		System.out.println(leitura);
	}
	
	public static void caixinha2(){
		int resposta = JOptionPane.showConfirmDialog(null, "Voc� � casado?");
		System.out.println(resposta);
		
		if (resposta == 0){
			System.out.println("CASADO");			
		}else{
			System.out.println("N�O � CASADO");
		}
	}
	
	public static void main(String[] args) {
		//caixinha1();
		caixinha2();
		
		
		
		
		

	}

}
