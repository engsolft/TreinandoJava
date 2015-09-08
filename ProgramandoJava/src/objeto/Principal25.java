package objeto;

import Teste.Animal;

public class Principal25 {

	public static void main(String[] args) {
		Pessoa objeto = new Pessoa();
		System.out.println(objeto.nome);
		
		Animal obj = new Animal();
		System.out.println(obj.tipo);
		obj.fazerBarulho();	
	}

}
