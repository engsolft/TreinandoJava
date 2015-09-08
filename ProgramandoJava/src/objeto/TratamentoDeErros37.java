package objeto;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TratamentoDeErros37 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número: ");
			int n = ler.nextInt();
			System.out.println(30/n);
			
		} catch (InputMismatchException erro) {
			
			//System.out.println("Você só pode infromar números inteiros" + erro);
			JOptionPane.showMessageDialog(null, "Você só pode infromar números inteiros " + erro);
		}catch (ArithmeticException erro) {
			System.out.println("O valor digitado não pode ser 0 " + erro);
		}

		

	}

}
