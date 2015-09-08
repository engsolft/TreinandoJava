package objeto;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TratamentoDeErros37 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		try {
			System.out.println("Digite um n�mero: ");
			int n = ler.nextInt();
			System.out.println(30/n);
			
		} catch (InputMismatchException erro) {
			
			//System.out.println("Voc� s� pode infromar n�meros inteiros" + erro);
			JOptionPane.showMessageDialog(null, "Voc� s� pode infromar n�meros inteiros " + erro);
		}catch (ArithmeticException erro) {
			System.out.println("O valor digitado n�o pode ser 0 " + erro);
		}

		

	}

}
