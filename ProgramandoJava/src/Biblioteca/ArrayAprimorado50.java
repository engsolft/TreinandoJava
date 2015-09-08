package Biblioteca;

import java.util.ArrayList;

public class ArrayAprimorado50 {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Carlos");
		nomes.add("Ana");
		
		//nomes.remove(0);
		
		//nomes.clear();
		
		System.out.println(nomes.toString());
		System.out.println(nomes.get(0)); // retorna o nome da posição
		System.out.println(nomes.isEmpty()); // retorna se está vazio o array (true ou false)
		System.out.println(nomes.contains("Carlos")); // se contem o nome iformado no parametro
		System.out.println(nomes.size());
		System.out.println(nomes.indexOf("Carlos"));
		
		
		
		
		
		

	}

}
