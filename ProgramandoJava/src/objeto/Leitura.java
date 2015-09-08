package objeto;

import java.util.Scanner;

public class Leitura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite uma letra: ");
		String leitura  = ler.nextLine();		
		System.out.println("Leitura: " + leitura);
		
		System.out.println("Digite um número inteiro: ");
		int leitura2 = ler.nextInt();
		System.out.println("Leitura: " + leitura2);
		
		System.out.println("Digite um número do tipo double: ");
		double leitura3 = ler.nextDouble();
		System.out.println("Leitura: " + leitura3);

	}

}
